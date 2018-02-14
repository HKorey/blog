package com.hquery.blog;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BlogApplicationTests {

	RestTemplate restTemplate;

	HttpHeaders headers = new HttpHeaders();

	@Before
	public void init() {
		RestTemplateBuilder builder = new RestTemplateBuilder();
		builder.setConnectTimeout(30000);
		builder.setReadTimeout(30000);
		restTemplate = builder.build();
		MediaType type = MediaType.parseMediaType("application/x-www-form-urlencoded; charset=UTF-8");
		headers.setContentType(type);
		headers.setConnection("keep-alive");

	}

	@Test
	public void contextLoads() throws Exception {

		File file = new File("D:/numberMap.txt");

		InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
		BufferedReader br = new BufferedReader(isr);
		String lineTxt = null;
		ExecutorService executorService = Executors.newFixedThreadPool(4);

		while ((lineTxt = br.readLine()) != null) {
			executorService.submit(new PostData(restTemplate, headers, lineTxt));
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

package com.cmuthumg.hellosb.controller;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestClientException;

//By TestRestTemplate
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void welcomeTest() throws RestClientException, MalformedURLException {
		URL url= new URL("http://localhost:" + port + "/hello/welcome");
		String sURL = url.toString();
		ResponseEntity<String> response = restTemplate.getForEntity(sURL, String.class);
		assertEquals("Welcome for Spring Boot Hello World", response.getBody());
	}
	
	@Test
	public void welcomeByNameTest() throws RestClientException, MalformedURLException {
		URL url= new URL("http://localhost:" + port + "/hello/welcome/Muthu");
		String sURL = url.toString();
		ResponseEntity<String> response = restTemplate.getForEntity(sURL, String.class);
		assertEquals("Welcome Muthu for Spring Boot Hello World", response.getBody());
	}
}

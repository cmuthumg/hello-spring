package com.cmuthumg.hellosb.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome for Spring Boot Hello World";
	}
	
	
	@RequestMapping("/welcome/{name}")
	public String welcomeWithName(@PathVariable("name") String sName) {
		return "Welcome "+sName+" for Spring Boot Hello World";
	}
}

package com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@GetMapping("/")
	public String hello() {
		
		return "Hello";
	}
	
	
	@GetMapping("/admin")
	public String helloAdmin() {
		
		return "Hello Admin";
	}
	
	
	@GetMapping("/user")
	public String helloUser() {
		
		return "Hello User";
	}
	
}

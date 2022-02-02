package com.dailycodebuffer.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value = "/")
	public String helloWorld() {
		return "Welcome to Daily code Buffer";
	}
}

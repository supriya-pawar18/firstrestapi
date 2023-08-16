package com.BikkadIt.FirstRestApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping("/greet")
	public String greet() {
		String msg="Good Morning";
		return msg;
	}
	
	@GetMapping("/greet1")
	public String greet1() {
		String msg="Good Evening All";
		return msg;
	}
}

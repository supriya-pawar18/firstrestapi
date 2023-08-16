package com.BikkadIt.FirstRestApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcomecontroller")
public class WelcomeController {

	@GetMapping("/wel")
	public ResponseEntity<String> welcome() {

		String msg="welcome to bikkadit";
		return new ResponseEntity<String>(msg,HttpStatus.OK);	
	}
	
	@GetMapping("/wel1")
	public ResponseEntity<String> welcome1() {

		String msg="welcome to bikkadit pune";
		return new ResponseEntity<String>(msg,HttpStatus.OK);	
	}
}

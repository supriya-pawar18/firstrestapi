package com.BikkadIt.FirstRestApp.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

	@GetMapping("/getPerson")
	private ResponseEntity<Person> getPerson() {
	     
		Person p=new Person();
		p.setPid(11);
		p.setName("pawar");
		p.setPaddress("pune");
		
		return new ResponseEntity<Person>(p,HttpStatus.OK);
	}
	
}

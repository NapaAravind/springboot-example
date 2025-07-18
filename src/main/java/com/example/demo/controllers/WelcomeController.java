package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/greeting")
	public ResponseEntity<String> gretting(){
		return new ResponseEntity<String>("Welcome To Napa Aravind", HttpStatus.OK);
	}

}

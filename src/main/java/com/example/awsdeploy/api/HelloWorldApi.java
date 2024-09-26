package com.example.awsdeploy.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldApi {
	
	@GetMapping
	public String helloWorld() {
		return "Hello world";
	}

}

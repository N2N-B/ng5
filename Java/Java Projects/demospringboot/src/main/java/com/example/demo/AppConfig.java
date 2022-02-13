package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfig {
	@RequestMapping("/howdy")
	public String howdy() {
		return "Welcome to springboot";
	}

}

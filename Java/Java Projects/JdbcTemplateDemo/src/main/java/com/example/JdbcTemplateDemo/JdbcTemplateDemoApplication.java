package com.example.JdbcTemplateDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcTemplateDemoApplication {
	@Autowired
	JdbcController jdbcController;

	public static void main(String[] args) {
		SpringApplication.run(JdbcTemplateDemoApplication.class, args);
	}

}

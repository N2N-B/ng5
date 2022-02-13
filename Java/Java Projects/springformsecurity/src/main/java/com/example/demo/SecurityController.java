package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//The web application is based on Spring MVC. 
//As a result, you need to configure Spring MVC and set up view controllers to expose these templates.


@Configuration
public class SecurityController implements WebMvcConfigurer{
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("home");
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/thedecisionlabs").setViewName("thedecisionlabs");
		registry.addViewController("/login").setViewName("login");
	}

}

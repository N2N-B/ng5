package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {
		//ConfigurableApplicationContext returns the customers object at runtime
		ConfigurableApplicationContext	configurableApplicationContext = SpringApplication.run(DependencyInjectionDemoApplication.class, args);
	    Customers customers = configurableApplicationContext.getBean(Customers.class);
	    customers.show();
	}

}

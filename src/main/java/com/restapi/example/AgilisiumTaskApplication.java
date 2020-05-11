package com.restapi.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.restapi.*")
public class AgilisiumTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgilisiumTaskApplication.class, args);
	}

}

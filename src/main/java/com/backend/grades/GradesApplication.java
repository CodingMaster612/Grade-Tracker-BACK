package com.backend.grades;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.backend")
public class GradesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradesApplication.class, args);
	}

}

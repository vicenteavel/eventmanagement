package com.challenge.eventmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class EventmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventmanagementApplication.class, args);
	}

}

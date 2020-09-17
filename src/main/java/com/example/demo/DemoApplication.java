package com.example.demo;

import java.util.TimeZone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Application started on port 8080 ...");
	}

}

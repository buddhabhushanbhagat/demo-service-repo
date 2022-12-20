package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoServiceApplication.class, args);
	}
	
	@GetMapping("/")
	public String welcome() {
		return "hello";
	}

}

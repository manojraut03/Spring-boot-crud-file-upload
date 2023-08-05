package com.demo.classicone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@SpringBootApplication
public class ClassiconeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassiconeApplication.class, args);
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	void test(){
		System.out.println("Check in 1");
		System.out.println("Check in 2");
		System.out.println("Check in 3");
		System.out.println("Check in 4");
	}

}

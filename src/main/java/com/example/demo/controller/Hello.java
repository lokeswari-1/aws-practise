package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@GetMapping("/")
	public static void sample() {
		System.out.println("hello cloud ..... , welcome to aws program");
	}

}

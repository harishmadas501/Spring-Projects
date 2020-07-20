package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController 
{
	@RequestMapping("/")
	public String display()
	{
		System.out.println("Request to Spring boot successful");
		return "Spring Boot Web Application";
	}
}

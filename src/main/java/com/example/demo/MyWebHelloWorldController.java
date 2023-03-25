package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWebHelloWorldController {

	@RequestMapping
	public String hello(String name){
		return "Hello " + name + "!";
	}

}
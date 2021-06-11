package com.isaccanedo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
	
	public String sayHello() {
		return "Hello and Welcome to the EasyNotes application";
	}

}

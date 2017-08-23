package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewsController{

	@RequestMapping("/news")
	public String handleRequest() {
		System.out.println("Inside NewsController.handleRequest()");
		return "news";
	}
}
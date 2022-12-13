package com.mauro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("search")
public class Demo {

	@GetMapping
	public String cerca() {
		return "ricerca";
	}
	
}

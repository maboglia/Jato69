package com.mauro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mvc")
public class BabboMVC {

	@GetMapping
	public String home() {
		return "home";
	}
	
	@GetMapping("jsp")
	public String homeJSP() {
		return "caravecchia";
	}
	
	
	
}

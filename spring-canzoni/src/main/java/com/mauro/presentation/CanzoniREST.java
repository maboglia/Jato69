package com.mauro.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mauro.entities.Canzone;

@RestController
@RequestMapping("api")
public class CanzoniREST {
	
	@GetMapping("test")
	public Canzone hello() {
		
		Canzone c = 
				new Canzone(1,"Una volta ancora","Fred De Palma feat. Ana Mena","pop",2019);
		
		return c;
	}
}

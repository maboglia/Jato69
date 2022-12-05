package com.mauro.presentation;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mauro.entities.Canzone;
import com.mauro.repos.CanzoneRepo;

@Controller
@RequestMapping("")
public class CanzoniMVC {

	@Autowired
	CanzoneRepo repo;
	
	
	@GetMapping(path = "/test")
	//@ResponseBody
	public String hello(Model m) {
		
		List<Canzone> canzoni = repo.findAll();
		
		m.addAttribute("canzoni", canzoni);
		
		return "song";
	}
	
}

package com.mauro.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mauro.entities.Canzone;
import com.mauro.repos.CanzoneRepo;

@RestController
@RequestMapping("api")
public class CanzoniREST {
	
	@Autowired
	CanzoneRepo repo;
	
	@GetMapping(path = "test")
	@CrossOrigin
	public List<Canzone> hello() {

		return repo.findAll();
	}
	
}

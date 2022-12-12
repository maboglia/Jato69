package com.mauro.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mauro.entities.Canzone;
import com.mauro.repos.CanzoneRepo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("api")
public class CanzoniREST {
	
	@Autowired
	CanzoneRepo repo;
	
	@GetMapping(path = "test")
	@CrossOrigin
	public List<Canzone> hello(HttpServletRequest request, HttpSession session) {

		//session.setAttribute("logged", "loggato");
		
//		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
//		
//		if (status != null) {
//			int statusCode = Integer.parseInt(status.toString());
//			if (statusCode == HttpStatus.NOT_FOUND.value()) {
//				return "404";
//			}
//		
//		}
		
		
		return repo.findAll();
	}
	
}

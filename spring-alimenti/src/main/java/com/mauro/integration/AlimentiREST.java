package com.mauro.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mauro.entities.Alimento;
import com.mauro.services.AlimentoService;

@RestController
public class AlimentiREST {

	@Autowired
	private AlimentoService service;
	
	@GetMapping("api/alimenti")
	public List<Alimento> trovaTutti(){
		return service.getAlimenti();
	}
	
	@GetMapping("api/alimenti/{cat}")
	public List<Alimento> trovaByCat(@PathVariable("cat") String categoria){
		return service.getAlimentiByCat(categoria);
	}
	
	
}

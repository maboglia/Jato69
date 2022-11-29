package com.mauro;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mauro.model.Automobile;
import com.mauro.service.AutomobiliService;

@SpringBootTest
class SpringAutomobiliApplicationTests {

	@Autowired
	private AutomobiliService service;
	
	
	@Test
	void contextLoads() {
		
		String[] marche = {"mercedes", "renault", "porsche"};
		String[] modelli = {"w567", "j345", "k456"};
		
		for (int i = 0; i < modelli.length; i++) {
			Automobile a = new Automobile();
			
			a.setMarca(marche[i]);
			a.setModello(modelli[i]);
			service.addAuto(a);
			
		}
		
		
		service
			.getAll()
			.forEach(System.out::println);
	
	}

}

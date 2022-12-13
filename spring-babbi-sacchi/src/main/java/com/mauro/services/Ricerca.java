package com.mauro.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Ricerca {

	@Bean(name = "googler")
	public RicercaGoogle cerca() {
		return pdc -> "https://google.com/search?q=" + pdc;
	}
	
}

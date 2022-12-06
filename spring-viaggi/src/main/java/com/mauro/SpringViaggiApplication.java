package com.mauro;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mauro.dal.DocumentoDAO;
import com.mauro.dal.ViaggioDAO;
import com.mauro.entities.Documento;
import com.mauro.entities.Viaggio;

@SpringBootApplication
public class SpringViaggiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringViaggiApplication.class, args);
	}

	@Bean
	public CommandLineRunner esempio(ViaggioDAO vDAO, DocumentoDAO dDAO) {
		return a -> {
			
			Viaggio v = new Viaggio();
			v.setDestinazione("Roma");
			
			Documento d = new Documento();
			d.setPath("locandine/locandina_roma.pdf");

			Documento d2 = new Documento();
			d2.setPath("locandine/vaccinazioni_obbligatorie.pdf");			
			
			Set<Documento> docs = new HashSet<>();
			docs.add(d);
			docs.add(d2);
			docs.add(d2);
			
			v.setDocumento(docs);
			d.setViaggio(v);
			d2.setViaggio(v);
			
			vDAO.save(v);
			
		};
	}
	
}

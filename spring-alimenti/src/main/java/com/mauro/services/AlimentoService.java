package com.mauro.services;

import java.util.List;

import com.mauro.entities.Alimento;

public interface AlimentoService {

	Alimento addAlimento(Alimento a); 
	Alimento updateAlimento(Alimento a); 
	boolean deleteAlimentoById(int id);
	
	List<Alimento> getAlimenti();
	Alimento getAlimentoById(int id);
	
	List<Alimento> getAlimentiByCat(String categoria);
	
}

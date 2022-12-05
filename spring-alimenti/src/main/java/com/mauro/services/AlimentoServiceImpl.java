package com.mauro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mauro.entities.Alimento;
import com.mauro.repos.AlimentoDAO;

@Service
public class AlimentoServiceImpl implements AlimentoService{

	@Autowired
	private AlimentoDAO repo;
	
	@Override
	public Alimento addAlimento(Alimento a) {
		return null;
	}

	@Override
	public Alimento updateAlimento(Alimento a) {
		return null;
	}

	@Override
	public boolean deleteAlimentoById(int id) {
		return false;
	}

	@Override
	public List<Alimento> getAlimenti() {
		return repo.findAll();
	}

	@Override
	public Alimento getAlimentoById(int id) {
		return null;
	}

	@Override
	public List<Alimento> getAlimentiByCat(String categoria) {
		return repo.findByCategoria(categoria);
	}

}

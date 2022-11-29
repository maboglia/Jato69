package com.mauro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mauro.model.Automobile;
import com.mauro.repos.AutomobiliDAO;

@Service
public class AutomobiliServiceImpl implements AutomobiliService {

	@Autowired
	private AutomobiliDAO repo;
	
	@Override
	public List<Automobile> getAll() {
		
		return repo.findAll();
	}

	@Override
	public Automobile getAutoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAuto(Automobile a) {
		repo.save(a);

	}

	@Override
	public void deleteAuto(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAuto(Automobile a) {
		repo.save(a);

	}

}

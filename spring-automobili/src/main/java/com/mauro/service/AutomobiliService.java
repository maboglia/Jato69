package com.mauro.service;

import java.util.List;

import com.mauro.model.Automobile;

public interface AutomobiliService {

	List<Automobile> getAll();
	Automobile getAutoById(int id);
	
	void addAuto(Automobile a);
	void deleteAuto(int id);
	void updateAuto(Automobile a);
	
}

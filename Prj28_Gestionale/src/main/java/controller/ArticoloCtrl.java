package controller;

import java.util.ArrayList;
import java.util.List;

import dao.ArticoloDAO;
import dao.ArticoloDAOImpl;
import model.Articolo;



public class ArticoloCtrl {
	
	ArticoloDAO dao;
	
	//costruttore di articoloDAO
	public ArticoloCtrl() {
		this.dao = new ArticoloDAOImpl();
	}


	public void addArticolo(Articolo a) {
		dao.addArticolo(a);
	}
 
	public void updateArticolo(Articolo a) {
		dao.addArticolo(a);
	}
 
	public void deleteArticoloById(int id) {
		dao.deleteArticoloById(id);
	}
 
	public Articolo getArticoloById(int id) {
		return dao.getArticoloById(id);
	}
 
	public List<Articolo> getArticoli() {
		return dao.getArticoli();
	}
	
}
	
	



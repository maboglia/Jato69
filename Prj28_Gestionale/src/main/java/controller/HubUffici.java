package controller;

import java.util.ArrayList;

import dao.UfficioDAO;
import dao.UfficioDAOImpl;
import model.Ufficio;

public class HubUffici {
	// private ArrayList<Appuntamento> appuntamenti = new ArrayList<Appuntamento>();
	private UfficioDAO dao = new UfficioDAOImpl();
 
	public void addUfficio(String nome, String telefono, String indirizzo, String citta, String regione) {
		dao.addUfficio(new Ufficio(nome, telefono, indirizzo, citta, regione));
		// appuntamenti.add(new Appuntamento(a,ora));
 
	}
 
	public void cancellaUfficio(int id) {
		dao.deleteUfficioById(id);
	}
 
	public Ufficio getUfficio(int a) {
		return dao.getUfficioById(a);
	}
	public void updateUfficio(Ufficio u) {
		dao.updateUfficio(u);
	}
 
	public ArrayList<Ufficio> getUfficio() {
		return (ArrayList<Ufficio>) dao.getUffici();
	}
}
 
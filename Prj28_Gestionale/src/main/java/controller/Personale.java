package controller;

import java.util.ArrayList;

import dao.ImpiegatoDAO;
import dao.ImpiegatoDAOImpl;
import model.Impiegato;

public class Personale {

	private ImpiegatoDAO dao = new ImpiegatoDAOImpl();

	public void addImpiegato(int id, String nome, String cognome, String ruolo, Impiegato rif_to, double stipendio,	int ufficio_id) {
		dao.addImpiegato(new Impiegato(id, nome, cognome, ruolo, rif_to, stipendio, ufficio_id));
	}

	public void deleteImpiegato(int id) {
		dao.deleteImpiegatoById(id);
	}

	public Impiegato getImpiegato(int id) {
		return dao.getImpiegatoById(id);
	}
	
	public void updateImpiegato(Impiegato i) {
		dao.updateImpiegato(i);
	}
	
	public ArrayList<Impiegato> getImpiegati() {
		return (ArrayList<Impiegato>) dao.getImpiegati();
	}

}

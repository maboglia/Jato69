package controller;

import java.util.ArrayList;

import model.Dipendente;
import model.Fattorino;
import model.Impiegato;

public class GestionaleCtrl {

	private ArrayList<Dipendente> dipendenti;

	public GestionaleCtrl() {
		this.dipendenti = new ArrayList<>();
	}
	
	public void addDipendente(Dipendente d) {
		this.dipendenti.add(d);
	}
	
	public ArrayList<Dipendente> getDipendenti() {
		return dipendenti;
	}
	
	public void addImpiegato(String nome) {
		this.dipendenti.add(new Impiegato(nome));
	}
	
	public void addDipendente(String nome, String tipo) {
		switch (tipo) {
		case "f":
			this.dipendenti.add(new Fattorino(nome));
			break;

		default:
			break;
		}
	}
	
	
}

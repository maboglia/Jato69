package controller;

import java.util.ArrayList;

import model.Appuntamento;
import model.Paziente;
import model.Stanza;

public class GestioneAppuntamenti {

	private ArrayList<Appuntamento> lista = new ArrayList<Appuntamento>();
	
	public void addAppuntamento(Appuntamento a) {
		this.lista.add(a);
	}
	
	public ArrayList<Appuntamento> getAppuntamentiByPaziente(Paziente p){
		ArrayList<Appuntamento> apptiPaziente = new ArrayList<Appuntamento>();
		
		for (Appuntamento appuntamento : lista) {
			if (appuntamento
					.getPaziente()
					.getCodFiscale()
					.equals(p.getCodFiscale()))
			apptiPaziente.add(appuntamento);
		}
		
		return apptiPaziente;
	}
	
	public ArrayList<Appuntamento> getLista(){
		return this.lista;
	}

	public ArrayList<Appuntamento> getAppuntamentiByStanza(Stanza s1) {
		
		ArrayList<Appuntamento> apptiStanza = new ArrayList<Appuntamento>();
		
		for (Appuntamento appuntamento : lista) {
			if (appuntamento
					.getStanza()
					.getNome()
					.equals(s1.getNome())
				)
				apptiStanza.add(appuntamento);
		}
		
		return apptiStanza;
		
	}
}

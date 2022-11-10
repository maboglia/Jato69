package model;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Appuntamento> appuntamenti = new ArrayList<Appuntamento>();
	
	public void addAppuntamento(String desc) {
		appuntamenti.add(new Appuntamento(desc));
	}
	
	public ArrayList<Appuntamento> getAppuntamenti() {
		return appuntamenti;
	}
}

package model;

import java.time.LocalTime;
import java.util.ArrayList;

import dal.AppuntamentiDAO;
import dal.AppuntamentiDAOImpl;

public class Agenda {
	//private ArrayList<Appuntamento> appuntamenti = new ArrayList<Appuntamento>();

	private AppuntamentiDAO dao = new AppuntamentiDAOImpl();
	
	public void addAppuntamento(String a) {
		dao.addAppuntamento(new Appuntamento(a));
		//appuntamenti.add(new Appuntamento(a));
	}
	public void addAppuntamento(String a, LocalTime ora) {
		dao.addAppuntamento(new Appuntamento(a, ora));
		//appuntamenti.add(new Appuntamento(a,ora));
	}
	
	public void cancellaAppuntamento(int id) {
		dao.deleteAppuntamentoById(id);
	}
	
	
	public Appuntamento getAppuntamento(int  a) {
		return dao.getAppuntamentoById(a);
	}
	
	public ArrayList<Appuntamento> getAppuntamenti() {
		return (ArrayList<Appuntamento>) dao.getAppuntamenti();
	}
}

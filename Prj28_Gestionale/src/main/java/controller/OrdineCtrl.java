package controller;

import java.util.List;

import dao.OrdineDAOimpl;
import model.Ordine;

public class OrdineCtrl {

	private OrdineDAOimpl dao = new OrdineDAOimpl();
	
	public List<Ordine> getOrdini(){
		return dao.getOrdini();
	}
	
}

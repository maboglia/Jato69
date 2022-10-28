package controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import db.TeatroDAO;
import model.Posto;
import model.Replica;
import model.Spettacolo;
import model.Teatro;

public class TeatroController {
	
	private TeatroDAO dao = new TeatroDAO();
	
	private static ArrayList<Posto> creaPosti(int file, int posizioni, String tipo) {
		
		ArrayList<Posto> temp = new ArrayList<>();
		
		for (int i = 1; i <= file; i++) {
			for (int j = 1; j <= posizioni; j++) {
				temp.add(new Posto(i, j, tipo));
			}
		}
		
		return temp;
		
	}
	
	public ArrayList<Teatro> elencoTeatri() {
		return dao.getTeatri();
	}
	
	public void addTeatro(String nomeTeatro) {
		
		Teatro t = new Teatro(nomeTeatro, 0);
		dao.addTeatro(t);

	}

}

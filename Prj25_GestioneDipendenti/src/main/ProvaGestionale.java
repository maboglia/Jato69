package main;

import controller.GestionaleCtrl;
import model.Dipendente;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;

public class ProvaGestionale {

	public static void main(String[] args) {
		
		GestionaleCtrl ctrl = new GestionaleCtrl();
		
		Dipendente d1 = new Fattorino("pippo");
		Dipendente d2 = new Fattorino("giuseppe");
		Dipendente d3 = new Fattorino("antonio");
		Dipendente d4 = new Fattorino("valentina");
		
		Dipendente d5 = new Impiegato("dario");
		Dipendente d6 = new Impiegato("davide");
		Dipendente d7 = new Impiegato("noemi");
		
		Dipendente d8 = new Dirigente("allen");
		
		ctrl.addDipendente(d1);
		ctrl.addDipendente(d2);
		ctrl.addDipendente(d3);
		ctrl.addDipendente(d4);
		ctrl.addDipendente(d5);
		ctrl.addDipendente(d6);
		ctrl.addDipendente(d7);
		ctrl.addDipendente(d8);
		
		
		for (Dipendente d : ctrl.getDipendenti()) {
			
			if (d instanceof Fattorino) {
				((Fattorino)d).setnConsegne(15);
			}

			if (d instanceof Impiegato) {
				((Impiegato)d).setOreLavoro(100);
			}

			if (d instanceof Dirigente) {
				((Dirigente)d).setEmolumenti(500);
			}
			
		}
		
		
		
		
		double totStipendi=0;
		
		for (Dipendente d : ctrl.getDipendenti()) {
			double stipendio = d.calcolaStipendio();
			totStipendi += stipendio;
			System.out.println(d + " stipendio: " + stipendio);
		}
		
		System.out.println("Totale stipendi " + totStipendi);
		

	}

}

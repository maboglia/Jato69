package interfaccia;

import database.Prodotti;
import logica.Scontrino;
import prodotti.Articolo;
import prodotti.Prodotto;

public class Bazar {

	public static void main(String[] args) {
		
		Prodotti.riempiProdotti();//magazzino pieno
		Scontrino sc1 = new Scontrino();
		
		//menu scelta
		mostraProdotti();
		
		//cassiere aggiunge articolo a scontrino
		sc1.addArticolo(new Articolo(Prodotti.findProdottoById(1), 2));
		sc1.addArticolo(new Articolo(Prodotti.findProdottoById(2), 3));
		sc1.addArticolo(new Articolo(Prodotti.findProdottoById(3), 4));
		sc1.addArticolo(new Articolo(Prodotti.findProdottoById(4), 5));
		sc1.addArticolo(new Articolo(Prodotti.findProdottoById(5), 25));
		
		//stampo scontrino
		System.out.println(sc1);
		
		
	}

	private static void mostraProdotti() {
		System.out.println("Elenco prodotti");
		
		for (Prodotto p : Prodotti.getProdotti()) {
			System.out.println(p);
		}
	}
	

}

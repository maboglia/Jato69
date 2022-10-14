package database;

import java.util.ArrayList;

import prodotti.Prodotto;

public class Prodotti {

	private static ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();
	
	public static void riempiProdotti() {
	
		String[] prodottiFake = {
				"maglia rossa", "maglia blu", "maglia verde", "giacca gialla", "pantalone nero"
		};
		
		for (int i = 0; i < prodottiFake.length; i++) {
			String nomeProdotto = prodottiFake[i];
			int codProdotto = i + 1;
			double prezzoProdotto = (Math.random() * 25);
			
			Prodotto p = new Prodotto(codProdotto, nomeProdotto, prezzoProdotto);
			addProdotto(p);
		}
	}
	
	public static void svuotaProdotti() {
		prodotti.clear();
	}
	
	
	
	public static void addProdotto(Prodotto p) {
		prodotti.add(p);
	}
	
	public static void removeProdotto(int codiceProdotto) {
		Prodotto trovato = findProdottoById(codiceProdotto);
		
		if (trovato != null) {
			prodotti.remove(trovato);
		}
		//devo eliminare il prodotto alla posizione x
	}
	
	public static void removeProdottoByPosizione(int posizione) {
		prodotti.remove(posizione);
	}
	
	public static Prodotto findProdottoById(int codProdotto) {
		for (Prodotto prodotto : prodotti) {
			if (prodotto.getCodiceProdotto() ==  codProdotto)
				return prodotto;
		}
		
		return null;
	}
	
	/**
	 * il metodo ritorna tutti i prodotti nel db
	 * @return array di prodotto
	 */
	public static ArrayList<Prodotto> getProdotti() {
		return prodotti;
 	}
	
}

package database;

import prodotti.Prodotto;

public class Prodotti {

	/**
	 * il metodo ritorna tutti i prodotti nel db
	 * @return array di prodotto
	 */
	public static Prodotto[] getProdotti() {
		Prodotto[] prodotti = {
				new Prodotto(1, "cartePokemonX5", 4.50),
				new Prodotto(2, "giornaleLaStampa", 1.50),
				new Prodotto(3, "rivista", 3.20),
				new Prodotto(4, "brioches", 4.60),
				new Prodotto(5, "lampada", 4.20),
		};
		return prodotti;
 	}
	
}

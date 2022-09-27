package libreria;

public class Libro {

	String titolo;
	String autore;
	int pagine;
	double prezzo;
	boolean disponibile;
	
	//l'unico metodo che NON ha un tipo di ritorno
	//l'unico metodo che dee iniziare con lettera maiuscola: cioè come la classe
	public Libro() {
		pagine = (int)(Math.random() * 200);
		prezzo = Math.random() * 20;
	}
	
	public String stampaScheda() {
		return titolo + " pagine: " + pagine + " euro: " + prezzo;
	}
	
}

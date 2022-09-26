package libreria;

public class Libro {

	String titolo;
	String autore;
	int pagine;
	double prezzo;
	boolean disponibile;
	
	public Libro() {//l'unico metodo che NON ha un tipo di ritorno
		System.out.println("Ho costruito un libro");
	}
	
}

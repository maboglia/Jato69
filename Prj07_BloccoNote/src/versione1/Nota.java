package versione1;

import java.util.Date;

public class Nota {
	
	String descrizione;
	Date data = new Date();
	
	public String stampa() {
		return data + " - " + descrizione;
	}
	
}

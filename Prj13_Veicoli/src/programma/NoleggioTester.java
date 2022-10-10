package programma;

import utenti.Utente;
import veicoli.Bicicletta;

public class NoleggioTester {

	public static void main(String[] args) {
		
		Bicicletta b1 = new Bicicletta();
		b1.setNome("BC143");
		b1.setPrezzoNoleggioOrario(6);
		
		Utente u1 = new Utente("Valentina");
		
		
		Noleggio n1 = new Noleggio(b1, u1, 10, 15);
		System.out.println("Il prezzo del noleggio è: " + n1.calcolaPrezzo());
		n1.pagamento();
		
		System.out.println(n1);
		
		
		

	}

}

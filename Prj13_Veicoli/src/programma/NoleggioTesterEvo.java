package programma;

import utenti.Utente;
import veicoli.Bicicletta;

public class NoleggioTesterEvo {

	public static void main(String[] args) {
		
		Bicicletta[] biciclette = {
				new Bicicletta(),//standard 10
				new Bicicletta("super bike", 35),
				new Bicicletta("electric bike super", 75)
		};
		
		Utente[] utenti = {
				new Utente("Luca"),
				new Utente("Federico"),
				new Utente("Noemi")
		}; 
		
		
		for (int i = 0; i < utenti.length; i++) {
//			System.out.println(utenti[i].getNome());
//			System.out.println(biciclette[i].getNome());
			
			Noleggio n = new Noleggio(biciclette[i], utenti[i], 10, 15);
			n.calcolaPrezzo();
			n.pagamento();
			System.out.println(n);
			
		}
		
		

	}

}

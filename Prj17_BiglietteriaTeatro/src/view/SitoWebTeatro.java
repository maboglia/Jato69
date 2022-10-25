package view;

import controller.GestioneTeatro;
import model.Replica;
import model.Spettacolo;
import model.Teatro;

public class SitoWebTeatro {

	public static void main(String[] args) {
		
		GestioneTeatro.init();
		
		//elenco teatri
		for (Teatro t :  GestioneTeatro.elencoTeatri()) {
			System.out.println(t);
		}
		
		//elenco spettacoli
		for (Spettacolo s : GestioneTeatro.elencoSpettacoli()) {
			System.out.println(s);
		}
		
		
		//elenco repliche
		for (Replica r : GestioneTeatro.elencoRepliche()) {
			System.out.println(r);
		}
		

	}

}

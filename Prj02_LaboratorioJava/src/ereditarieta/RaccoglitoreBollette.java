package ereditarieta;

import java.util.ArrayList;
import java.util.List;

public class RaccoglitoreBollette {


	public static void main(String[] args) {
		List<Bolletta> bollette = new ArrayList<Bolletta>();
		
		Bolletta bollGas1 = new BollettaGas();//polimorfismo
		Bolletta bollLuce1 = new BollettaLuce();
		Bolletta bollTelefono = new BollettaTelefono();

		bollGas1.importo = 15;
		//bollGas1.metriCubi = 12;
		bollLuce1.importo = 20;
		bollTelefono.importo = 25;
		
		bollette.add(bollGas1);
		bollette.add(bollLuce1);
		bollette.add(bollTelefono);
		
		double totale = 0;
		
		for (Bolletta b : bollette) {//for migliorato: foreach
			totale += b.importo;
		}
		
		System.out.println("Il totale delle bollette è " +  totale);
		
		for (Bolletta b : bollette) {
			System.out.println(b); 
		}
		
		
		
	}
	
	

	
}

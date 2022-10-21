package controller;

import java.util.ArrayList;
import java.util.List;
import model.*;

public class RaccoglitoreBollette {


	public static void main(String[] args) {
		List<Bolletta> bollette = new ArrayList<Bolletta>();
		
		Bolletta bollGas1 = new BollettaGas(15,12);//polimorfismo
		Bolletta bollLuce1 = new BollettaLuce(20,15);
		Bolletta bollTelefono = new BollettaTelefono(25);

//		bollGas1.setImporto(15);
//		//bollGas1.metriCubi = 12;
//		bollLuce1.setImporto(20);;
//		bollTelefono.setImporto(25);
		
		
		bollette.add(bollGas1);
		bollette.add(bollLuce1);
		bollette.add(bollTelefono);
		
		double totale = 0;
		
		for (Bolletta b : bollette) {//for migliorato: foreach
			totale += b.getImporto();
		}
		
		System.out.println("Il totale delle bollette è " +  totale);
		
		for (Bolletta b : bollette) {
			System.out.println(b); 
		}
		
		
		
	}
	
	

	
}

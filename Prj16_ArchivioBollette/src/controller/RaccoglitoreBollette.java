package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.*;

public class RaccoglitoreBollette {


	public static void main(String[] args) throws FileNotFoundException{
		List<Bolletta> bollette = new ArrayList<Bolletta>();
		
		File f = new File("files/bollette.csv");
		
		Scanner sc = new Scanner(f);
		
		while(sc.hasNextLine()) {
			
			String riga = sc.nextLine();
			String[] valori = riga.split(",");
			
			String tipo = valori[0];
			String importo = valori[1];
			
			String misura = (valori.length > 2 && valori[2]!=null) ? valori[2] :   null;//op ternario   (condizione) ? true : false;
			
			
			if (tipo.equals("GAS")) {
				Bolletta bollGas1 = new BollettaGas(Double.parseDouble(importo),Double.parseDouble(misura));//polimorfismo
				bollette.add(bollGas1);
			}
			
			if (tipo.equals("LUCE")) {
				Bolletta bollLuce = new BollettaLuce(Double.parseDouble(importo),Double.parseDouble(misura));//polimorfismo
				bollette.add(bollLuce);
			}
			
			if (tipo.equals("TELEFONO")) {
				Bolletta bollTel = new BollettaTelefono(Double.parseDouble(importo));//polimorfismo
				bollette.add(bollTel);
			}
			
			
			
		}
		
		
		double totale = 0;
		
		for (Bolletta b : bollette) {//for migliorato: foreach
			totale += b.getImporto();
		}
		
		System.out.println("Il totale delle bollette è " +  totale);
		
		for (Bolletta b : bollette) {
			
			if (b instanceof BollettaLuce) {
				System.out.print("***"); 
				
			}
			
			System.out.println(b); 
		}
		
		
		
	}
	
	

	
}

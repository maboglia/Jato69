package versione1;

import java.util.Scanner;

public class Gestione {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String risposta = null;
		String descrizione = null;
		int posizione = 0;
		BloccoNote bn = new BloccoNote();
		boolean gira = true;
		
		while (gira) {
			System.out.println("a) aggiungi nota");
			System.out.println("b) stampa note");
			System.out.println("x) esci");
			
			risposta = sc.nextLine();			
			
			switch (risposta) {
			case "a":
				System.out.println("Inserisci la descrizione della nota");
				descrizione = sc.nextLine();
				System.out.println("Inserisci la posizione della nota");
				posizione = sc.nextInt();
				sc.nextLine();
				bn.addNota(descrizione, posizione);
				break;
			case "b":
				bn.stampa();
				break;
			case "x":
				gira = false;
				break;

			default:
				System.out.println("Opzione non disponibile");
				break;
			}
			
			
		}
		System.out.println("Grazie per aver usato il nostro software!");
		
	}

	
	
}

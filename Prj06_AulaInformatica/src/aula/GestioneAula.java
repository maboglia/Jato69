package aula;

import java.util.Scanner;

public class GestioneAula {

	public static void main(String[] args) {
		
		boolean gira = true;
		Scanner sc = new Scanner(System.in); 
		String risposta = null;
		Registro r = new Registro(); 
		
		while (gira) {
			
			System.out.println("Scegli l'operazione:");
			System.out.println("a) inizializza registro");
			System.out.println("b) fai l'appello");
			System.out.println("c) stampa resoconto");
			System.out.println("x: esci");
			
			risposta = sc.next();
			
			switch (risposta) {
				case "a":
					System.out.println("vuoi inizializzare");
					r.init();
					break;
				case "b":
					System.out.println("vuoi fare l'appello");
					r.appello();
					break;
				case "c":
					System.out.println("vuoi stampare resoconto");
					String resoconto = r.resoconto();
					System.out.println(resoconto);
					break;
				case "x":
					System.out.println("vuoi uscire");
					gira = false;
					break;
	
				default:
					System.out.println("opzione non disponibile");
					break;
			}
			
			
		}
		
		
		

	}

}

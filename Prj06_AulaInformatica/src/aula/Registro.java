package aula;

import java.util.Scanner;

public class Registro {

	Studente[] elenco = null;//prendo l'array dalla classe Jato69
	int presenti;
	int assenti;
	
	public void init() {
//		if (Math.random() > 0.5)
		elenco = StudentiJato69.studenti;
//		else 
//		elenco = StudentiJato70.studenti;

	}
	
	public void appello() {
		//1 qui scorro l'elenco per fare l'appello
		Scanner sc = new Scanner(System.in); 
		String risposta = null;
		
		for (int i = 0; i < elenco.length; i++) {
			
			System.out.println("E' presente lo studente");
			System.out.println(elenco[i].getStudente());
			
			risposta = sc.next();
			
			if (risposta.equalsIgnoreCase("s")) {
				//2 se lo studente è presente incremento i presenti
				presenti++;
			} else {
				//3 se lo studente è assente incremento gli assenti
				assenti++;
			}
			
		}
		
	}
	
	public String resoconto() {
		
		return "oggi " //trovare il modo per aggiungere la data di oggi
				+ "\n sono presenti " + presenti 
				+ "\n sono assenti " + assenti; 
	}
	
}

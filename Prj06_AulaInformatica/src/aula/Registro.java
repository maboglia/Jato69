package aula;

import java.util.Scanner;

public class Registro {

	Studente[] elenco = new Studente[28];
	int presenti;
	int assenti;
	
	public void init() {
		//qui devo trovare un modo per riempire il registro
		
		String[] studenti = {
				"Abel Nucci",
				"Adrian Bucur",
				"Alessia Marton",
				"Andrea Nardo",
				"Angelika Grażyna",
				"Antonio Napolitano",
				"Clarissa Quagliotti",
				"Claudia Seres",
				"Dalila DiPaolo",
				"dario mucci",
				"Davide Valerio",
				"Federico Fissore",
				"Francesco Villa",
				"giacomo salato",
				"Giuseppe Morabito",
				"Leonardo Mundaca",
				"Lorena Scattone",
				"Lorenzo Pace",
				"Lorenzo Zeppegno",
				"Luca Franchino",
				"Luisa Acevedo",
				"Nicolò Petrucci",
				"nigusu cosentini",
				"Noemi DeCicco",
				"riccardo fogliasso",
				"Riccardo Tucci",
				"Valentina DeIaco",
				"Valentina DiGesu",
		};
		
		for (int i = 0; i < studenti.length; i++) {//ciclo le stringhe none cognome
			
			String[] nomecognome = studenti[i].split(" ");//separo con lo spazio il nome e il cognome
			String nome = nomecognome[0];//prendo dall'array il nome alla pos 0
			String cognome = nomecognome[1];//prendo dall'array il cognome alla pos 1
			
			Studente s = new Studente();//creo l'oggetto studente
			s.setStudente(nome, cognome);//valorizzo le sue proprietà nome e cognome
			elenco[i] = s;//aggiungo lo studente all'array elenco
			
			
		}
		
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

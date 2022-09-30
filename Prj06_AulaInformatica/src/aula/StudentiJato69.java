package aula;

public class StudentiJato69 {

	public static Studente[] studenti = init();//elenco
	
	
	public static Studente[] init() {
		//qui devo trovare un modo per riempire il registro
		
		String[] database = {
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
				//"Lorenzo Pace",
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
		
		Studente[] studentiTemp = new Studente[database.length];
		
		for (int i = 0; i < database.length; i++) {//ciclo le stringhe none cognome
			
			String[] nomecognome = database[i].split(" ");//separo con lo spazio il nome e il cognome
			String nome = nomecognome[0];//prendo dall'array il nome alla pos 0
			String cognome = nomecognome[1];//prendo dall'array il cognome alla pos 1
			
			//Studente s = new Studente(nome, cognome);//creo l'oggetto studente
			//s.setStudente(nome, cognome);//valorizzo le sue proprietà nome e cognome
			studentiTemp[i] = new Studente(nome, cognome);//creo l'oggetto studente;//aggiungo lo studente all'array elenco
			
			
		}
		
		return studentiTemp;//ritorno un array di Studente già inizializzato con gli studenti del db
		
	}	
	
	
}

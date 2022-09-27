package libreria;

import java.util.Scanner;

public class Libreria {

	public static void main(String[] args) {
		
//		if (args[0] != null) {
//			System.out.println(args[0]);
//		}
		
		Libro[] scaffale = new Libro[10];
		Scanner scanner = new Scanner(System.in);
		
		String[] titoli = {
				"io, robot",
				"i promessi sposi",
				"guerra e pace",
				"i malavoglia",
				"divina commedia",
				"il ritratto di dorian gray",
				"neuromancer",
				"codice da vinci",
				"notre dame de paris",
				"il richiamo di cthulhu"
		};
		
		
		
		for (int i = 0; i < scaffale.length; i++) {
			
			System.out.println("Inserisci il titolo del libro nr. " + i);
			
			scaffale[i] = new Libro();
			scaffale[i].titolo = titoli[i];
			
		}
		

		for (int i = 0; i < scaffale.length; i++) {
			if (scaffale[i] != null) {
				System.out.println(scaffale[i].stampaScheda());
			}
		}
		
		
	}

}

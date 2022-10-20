package classi;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Stringhe {
	
	static String parola = "ciao";
	static Scanner scanner = new Scanner(System.in);
	
	String tentativo = "salut";
	
	public static void main(String[] args) {
		
		
		
		
		Stringhe pierre = new Stringhe();
		Stringhe marie = new Stringhe();
		Stringhe bruno = new Stringhe();
		
		String resultP = faiIlTentativo(pierre);
		String resultM = faiIlTentativo(marie);
		String resultB = faiIlTentativo(bruno);
		
		System.out.println("pierre" +resultP);
		System.out.println("marie"+resultM);
		System.out.println("bruno"+resultB);
		
//		
//		System.out.println(pierre.tentativo.equals(parola));
//		System.out.println(marie.tentativo.equals(parola));
//		bruno.tentativo = "bonjour";
//		System.out.println(bruno.tentativo.equals(parola));//false
//		
//		Stringhe.parola = "bonjour";//modificata
//		
//		System.out.println(bruno.tentativo.equals(parola));//true
//		

	}

	private static String faiIlTentativo(Stringhe player) {
		player.tentativo = getInputString("Caro player, fai il tentativo");
		String risposta = null;
		
		if (player.tentativo.equals(parola)) {
			risposta = "Sei entrato!";
		} else {
			risposta ="prova ancora!!";
		}
		
		return risposta;
	}

	private static String getInputString(String question) {
		
		System.out.println(question);
		
		return scanner.nextLine();
		
	}
	
	
	
	
}

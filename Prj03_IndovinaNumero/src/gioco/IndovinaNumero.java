package gioco;

import java.util.Scanner;

public class IndovinaNumero {

	public static void main(String[] args) {
		
		int numeroDaIndovinare = (int)(Math.random() * 100) + 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Indovina il numero, inserisci un numero intero tra 1 e 100");
		
		int numeroUtente = input.nextInt();
		
		if (numeroUtente == numeroDaIndovinare) {
			System.out.println("complimenti, hai indovinato!!!");
		} else if (numeroUtente < numeroDaIndovinare) {
			System.out.println("troppo basso");
		} else {
			System.out.println("troppo alto");
		}
		
		
	}

}

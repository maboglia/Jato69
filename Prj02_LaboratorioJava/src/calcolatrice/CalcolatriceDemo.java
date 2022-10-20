package calcolatrice;

//tutto quello che è fuori dal package in cui mi trovo deve essere importato
import java.util.Scanner;

public class CalcolatriceDemo {
	public static void main(String[] args) {
		
		double a = chiediNumero();
		double b = chiediNumero();
		
		//int risultato = addizione(5,9);
		
		System.out.println("Addizione: " + Calcolatrice.addizione(a,b));
		System.out.println("Sottrazione: " + Calcolatrice.sottrazione(a,b));
		System.out.println("Moltiplicazione: " + Calcolatrice.moltiplicazione(a,b));
		System.out.println("Divisione: " + Calcolatrice.divisione(a,b));
		 
		
	}
	
	public static double chiediNumero() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		double numero = input.nextDouble();
		return numero;
		
	}
	
}

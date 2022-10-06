package interfaccia;

import java.util.Scanner;

public class MioScanner {
	
	static Scanner sc = new Scanner(System.in);
	
	
	public static String leggiStringa(String domanda) {
		System.out.println(domanda);
		return sc.nextLine();
	}
	
	public static int leggiIntero(String domanda) {
		System.out.println(domanda);
		return sc.nextInt();
	}
	
	public static double leggiDouble(String domanda) {
		System.out.println(domanda);
		return sc.nextDouble();
	}
	
	

}

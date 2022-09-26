package stringhe;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci username");
		String user = scanner.next();

		System.out.println("Inserisci password");
		String passw = scanner.next();

		
		if (passw.equals("segreto") && user.equals("pippo") ) {
			System.out.println("sei entrato nell'area riservata");
		} else {
			System.out.println("password errata, prova ancora");
		}
		
		
	}

}

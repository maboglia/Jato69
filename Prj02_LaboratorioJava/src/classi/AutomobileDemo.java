package classi;

import java.util.Scanner;

public class AutomobileDemo {

	public static void main(String[] args) {
		
		Automobile a1 = new Automobile("fiat", "500", true);

		
		System.out.println(a1.stampa());
		
	
		Automobile a2 = new Automobile("ferrari", "GT305");
		
		a2.accendi(100);
		a2.spegni();
		System.out.println(a2.stampa());
		
		
		
	}

}

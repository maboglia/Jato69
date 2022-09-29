package demo;

import forme.Rettangolo;

public class Geometria {

	public static void main(String[] args) {
		Rettangolo r1 = new Rettangolo(5, 4);

		System.out.println(r1.getInfo());
		
//		System.out.println(r1.getPerimetro());
//		System.out.println(r1.getSuperficie());
		
//		System.out.println("Posizione di r1: " + r1);
//		System.out.println(r1.base);
//		System.out.println(r1.altezza);

		Rettangolo r2 = new Rettangolo(4,3);

		System.out.println(r2.getInfo());
		
		//		System.out.println("Posizione di r2: " + r2);
//		System.out.println(r2.getPerimetro());
//		System.out.println(r2.getSuperficie());
		
	}

}

package demo;

import forme.Punto;
import forme.Rettangolo;
import forme.Segmento;

public class Geometria {

	public static void main(String[] args) {

		Punto a = new Punto(3, 2);
		Punto b = new Punto(8, 2);
		Punto c = new Punto(3, 6);
		
		Segmento ab = new Segmento(a, b);
		System.out.println(ab.lunghezza());
		
		Segmento ac = new Segmento(a, c);
		System.out.println(ac.lunghezza());
		
		Segmento bc = new Segmento(b, c);
		System.out.println(bc.lunghezza());
		
	}

}

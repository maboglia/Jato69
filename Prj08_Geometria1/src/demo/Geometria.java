package demo;

import forme.Punto;
import forme.Quadrato;
import forme.Rettangolo;
import forme.Segmento;
import forme.Triangolo;

public class Geometria {

	public static void main(String[] args) {

		Punto a = new Punto(3, 2);
		Punto b = new Punto(8, 2);
		Punto c = new Punto(3, 6);
		
		Segmento ab = new Segmento(a, b);
		System.out.println(ab);
		System.out.println(ab.lunghezza());
		
		Segmento ac = new Segmento(a, c);
		System.out.println(ac.lunghezza());
		
		Segmento bc = new Segmento(b, c);
		System.out.println(bc.lunghezza());
		
		Triangolo t1 = new Triangolo(a, b, c);
		System.out.println(t1.getPerimetro());
		System.out.println(t1.getArea());
		
		Rettangolo r1 = new Rettangolo(ab, bc);
		System.out.println(r1);

		Rettangolo r2 = new Rettangolo(ab, bc);
		System.out.println(r2);
		
		Quadrato q1 = new Quadrato(ab);
		System.out.println(q1);
		

	}

}

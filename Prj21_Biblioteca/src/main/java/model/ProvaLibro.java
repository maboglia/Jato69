package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ProvaLibro {

	public static void main(String[] args) {
		
		Libro[] libri = {
				new Libro(1, "Zanna bianca"),
				new Libro(2, "Cuore"),
				new Libro(3, "Barbablu"),
				new Libro(4, "I malavoglia"),
		};

		ArrayList<Libro> libri2 = new ArrayList<>(Arrays.asList(libri));
		
		Arrays.sort(libri);
		
		Collections.sort(libri2);
		
		for (Libro libro : libri2) {
			System.out.println(libro);
		}
		
		
	}

}

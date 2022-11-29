package interfacce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


//class ComparatoreLibriTitolo implements Comparator<Libro>{
//
//	@Override
//	public int compare(Libro primoLibro, Libro secondoLibro) {
//		return primoLibro.titolo.compareTo(secondoLibro.titolo);
//	}
//	
//}


public class Libreria {

	public static void main(String[] args) {
		
		Libro[] libri = {
				new Libro(1, "Zanna bianca"),
				new Libro(2, "Cuore"),
				new Libro(45, "Barbablu"),
				new Libro(4, "I malavoglia"),
				new Libro(5, "Cuore"),
				new Libro(6, "Barbablu"),
		};

		//Arrays.sort(libri);
		
		System.out.println(libri);
		
		List<Libro> libri2 = Arrays.asList(libri);
	
		Collections.sort(libri2, (l1, l2) -> l2.id -l1.id);
		System.out.println(libri2);
		
		//ComparatoreLibriTitolo clt = new ComparatoreLibriTitolo();
		
		//Comparator<Libro> comparatoreTitolo = (pl, sl) -> {
//			pl.titolo.compareTo(sl.titolo)
//		};
			
		
		
		Set<String> libriPerTitolo = libri2
			.stream()
			.sorted(    (pl, sl) -> pl.titolo.compareTo(sl.titolo)    )
			.map(l -> l.titolo)
			.collect( Collectors.toSet());//operazione terminale
		
		libri2
		.stream()
		.sorted((pl, sl) -> pl.idEditore - sl.idEditore)
		.forEach(l -> System.out.println(l));//operazione terminale
	
		libriPerTitolo.forEach(titolo -> System.out.println(titolo));

	}
}

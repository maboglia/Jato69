package collezioni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ProvaListe {

	public static void main(String[] args) {
		
		String[] colori = {
				"rosso",
				"verde",
				"giallo",
				"blu",
				"arancione",
				"viola",
				"verde",
				"rosa",
		};
		
		//List<String> listaColori = new ArrayList<>();
		List<String> listaColori = new LinkedList<>(Arrays.asList(colori));
		List<String> listaColori2 = new ArrayList<>();
		
		listaColori2.addAll(listaColori);
		
		
//		for (String colore : colori) {
//			listaColori.add(colore);
//		}
		
		System.out.println("Ci sono " + listaColori.size() + " colori");
		for (String coloreLista : listaColori) {
			System.out.println(coloreLista);
		}
		
		if (listaColori.contains("verde")) {
			
		}

	}

}

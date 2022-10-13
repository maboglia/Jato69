package interfaccia;

import database.Prodotti;
import logica.Scontrino;
import prodotti.Articolo;
import prodotti.Prodotto;

public class Bazar {

	public static void main(String[] args) {
		//elencoProdotti();
		Articolo[] articoli= {
			new Articolo(Prodotti.getProdotti()[0], 2),	
			new Articolo(Prodotti.getProdotti()[2], 5),	
			new Articolo(Prodotti.getProdotti()[4], 3),	
		};
		
		stampaScontrinoHTML(articoli);
		
		
	}

	private static void stampaScontrinoHTML(Articolo[] articoli) {

		StringBuilder sb = new StringBuilder("<html>\n");
		
		sb.append("<head>\n");
		sb.append("</head>\n");
		sb.append("<body>\n");
			
		sb.append("<ul>\n");

		for (Articolo articolo : articoli) {
			sb.append("<li>" + articolo.getProdotto().getNome() +"</li>\n");
		}
		
		sb.append("</ul>\n");
		
		sb.append("<script> console.log('funziona'); </script>");
		
		sb.append("</body>\n");
		
		System.out.println(sb.toString());
		
	}

	private static void elencoProdotti() {
		for (Prodotto p : Prodotti.getProdotti()) {
			System.out.println(p);
		}
	}

}

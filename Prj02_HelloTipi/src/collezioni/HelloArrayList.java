package collezioni;

import java.util.ArrayList;

public class HelloArrayList {

	public static void main(String[] args) {

		ArrayList<String> prodotti = new ArrayList<>();
		
		prodotti.add("scarpe");
		prodotti.add("maglie");
		prodotti.add("scarpe");
		
		prodotti.size();
		
		prodotti.get(0);
		
		prodotti.remove(0);
		
		for (String prodotto : prodotti) {
			System.out.println(prodotto);
		}
		
	}

}

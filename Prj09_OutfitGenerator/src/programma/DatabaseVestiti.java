package programma;

import vestiti.*;

public class DatabaseVestiti {
	
	public static Borsa[] borse = new Borsa[5];
	public static Cappello[] cappelli = new Cappello[5];
	public static Scarpa[] scarpe = new Scarpa[5];
	public static Pantalone[] pantaloni = new Pantalone[5];
	public static Maglia[] maglie = new Maglia[5];
	
	public static void init() {
		
		String[] colori = {"Blu", "Rosso", "Verde", "Giallo", "Viola"};
		
		for (int i = 0; i < colori.length; i++) {
			
			borse[i] = new Borsa("borsa bella", colori[i]);
			cappelli[i] = new Cappello("Cappello di paglia", colori[i]);
			scarpe[i] = new Scarpa("Scarpa adidas", colori[i]);
			pantaloni[i] = new Pantalone("Pantalone Zara", colori[i]);
			maglie[i] = new Maglia("Maglia Zara", colori[i]);
			
			
		}
		
	}
	

}

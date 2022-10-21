package eccezioni;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LeggiFIle {

	public static void main(String[] args) {
		
		File f = new File("files/gatti.txt");
		
		ArrayList<Gatto> gattile = new ArrayList<Gatto>();
		
		try {
			Scanner sc = new Scanner(f);
			
			while(sc.hasNextLine()) {
			
				String rigaIntera = sc.nextLine();
				
				String[] dueEta = rigaIntera.split(",");
				
				String etaGatto = dueEta[0];
				String etaUmano = dueEta[1];
				
				Gatto g = new Gatto(etaGatto, etaUmano);
				gattile.add(g);
				
				//System.out.println("Un gatto di " + etaGatto + " corrisponde a " + etaUmano + " di un umano");
				
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("il gattile ha " + gattile.size() + " gatti");
		
		for (Gatto gatto : gattile) {
			System.out.println(gatto);
		}

	}

}

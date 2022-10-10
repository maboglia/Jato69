package programma;

import veicoli.Bicicletta;

public class BiciclettaTester {

	public static void main(String[] args) {
		
		Bicicletta b1 = new Bicicletta();
		b1.setColore("blu");
		b1.setMarcia(14);
		b1.setNome("Antonio");
		b1.setPrezzoNoleggioOrario(11);
		
		Bicicletta b2 = new Bicicletta();
		b2.setMarcia(3);
		b2.setNome("luca");
		b2.setPrezzoNoleggioOrario(350);
		
		Bicicletta b3 = new Bicicletta();
		b3.setMarcia(5);
		b3.setNome("Alessia");
		b3.setPrezzoNoleggioOrario(150);
		
		System.out.println(b1.getPrezzoNoleggioOrario());
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

	}

}

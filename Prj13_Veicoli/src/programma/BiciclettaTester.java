package programma;

import veicoli.Bicicletta;

public class BiciclettaTester {

	public static void main(String[] args) {
		
		Bicicletta b1 = new Bicicletta();
		b1.cambiaColore("blu");
		b1.cambiaMarcia(14);
		b1.cambiaNome("Antonio");
		
		Bicicletta b2 = new Bicicletta();
		b2.cambiaMarcia(3);
		b2.cambiaNome("luca");
		
		Bicicletta b3 = new Bicicletta();
		b3.cambiaMarcia(5);
		b3.cambiaNome("Alessia");
		
		
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

	}

}

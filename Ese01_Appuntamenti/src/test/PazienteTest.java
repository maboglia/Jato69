package test;

import model.Paziente;

public class PazienteTest {

	public static void main(String[] args) {
		Paziente p = new Paziente("pippo", "pippi", "ppp123");
		System.out.println(p.getNome());

		System.out.println(p);
		
		p = null;
		System.out.println(p);
		
		
	}

}

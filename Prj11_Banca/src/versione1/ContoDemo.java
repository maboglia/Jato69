package versione1;

public class ContoDemo {

	public static void main(String[] args) {
		
		ContoCorrente cc1 = new ContoCorrente(1, "mauro");
		ContoCorrente cc2 = new ContoCorrente(2, "allen");
		
		cc1.versamento(50);
		cc1.versamento(50);
		cc2.versamento(500);
		cc2.versamento(500);

		System.out.println(cc1.stampa());
		System.out.println(cc2.stampa());
		
		cc1.prelievo(100);
		cc1.prelievo(100);
		System.out.println(cc1.stampa());

		cc2.prelievo(100);
		
		System.out.println(cc2.stampa());
		
	}

}

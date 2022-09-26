package selezione;

public class ProvaIf {

	public static void main(String[] args) {
		
		int ora;
		ora = 12;
		
		ora = 2;
		
		if (ora >= 6 && ora < 12) {
			System.out.println("buongiorno, sono le " + ora);
		} else if(ora >= 12 && ora < 20 ) {
			System.out.println("buon pomeriggio, sono le " + ora);
		} else {
			System.out.println("Buonanotte, sono le " + ora);
		}
		

	}

}

package iterazione;

public class ProvaWhile {

	public static void main(String[] args) {
		
		int n = 5;
		
		while(n == 5) {
			System.out.println("gira");
			
			double casuale = Math.random(); 
			
			System.out.println("Il numero double scelto a caso è: " + casuale);
			
			if (casuale < 0.1) {
				n = 7;
			}
		}
		

	}

}

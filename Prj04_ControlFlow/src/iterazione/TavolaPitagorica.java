package iterazione;

public class TavolaPitagorica {

	public static void main(String[] args) {
		

		final int RIGHE = 10;
		final int COLONNE = 10;
		
		for (int i = 1; i <= RIGHE; i++) {
			
			for(int j = 1; j <= COLONNE; j++) {
				System.out.print("\t" + (i * j) );
			}
			
			//per andare a capo ogni 10 caratteri
			System.out.println();
		}
		

	}

}

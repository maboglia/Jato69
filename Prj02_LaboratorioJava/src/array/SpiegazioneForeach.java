package array;

public class SpiegazioneForeach {

	public static void main(String[] args) {
		

		int[] voti = { 25,26,27,28,29,30 };
		
		double totale = 0;
		for (int i = voti.length-1; i >=0; i--) {
			totale += voti[i];
			System.out.println("Esame nr. " + i + " voto " + voti[i]);
		}
		
		/*for (int voto : voti) {
			totale += voto;
			System.out.println(voto);
		}*/
		
		System.out.println(totale);
		
		

	}

}

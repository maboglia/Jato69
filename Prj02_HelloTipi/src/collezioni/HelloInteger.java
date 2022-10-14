package collezioni;

import java.util.ArrayList;

public class HelloInteger {

	public static void main(String[] args) {
		
		ArrayList<Integer> voti = new ArrayList<>();
		
		voti.add(25);//int  Integer
		voti.add(28);
		voti.add(30);
		voti.add(18);
		
		double totale = 0;
		
//		for (int i = 0; i < voti.size(); i++) {
//			totale += voti.get(i);//voti[i]
//		}
		
		for (int voto : voti) {
			if (voto > 20)
			totale += voto;
		}
		
		System.out.println("il totale " + totale);
		System.out.println("la media aritmetica " + (totale/voti.size()));

	}

}

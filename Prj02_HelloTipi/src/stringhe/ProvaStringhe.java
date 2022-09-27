package stringhe;

public class ProvaStringhe {

	public static void main(String[] args) {
		
		String s1 = "ciao";
		String s3 = "ciao";
		
		
		String s2 = new String("Ciao");
		s2.length();
		s2 = "ciao mondo";
		
		System.out.println(s1 == s3);//confrontando la posizione 

		System.out.println();
		//
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("le due stringhe sono uguali");
		} else {
			System.out.println("le due stringhe sono diverse");
		}
		
	}

}

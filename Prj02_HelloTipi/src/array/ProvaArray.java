package array;

public class ProvaArray {

	public static void main(String[] args) {
		
		//0-based
		//dimensione prefissata: length = proprietà
//		String[] note = new String[7];
//
//		note[0] = "do";
//		note[1] = "re";
//		note[2] = "mi";
//		note[3] = "fa";
//		note[4] = "sol";
//		note[5] = "la";
//		note[6] = "si";
		
		String[] note = {"do", "re", "mi", "fa", "sol", "la", "si"};
		
		for (int i = 0; i < note.length; i++) {
			System.out.println(note[i].toUpperCase());
			
		}
		
		
		
	}

}

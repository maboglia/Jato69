package programma;

public class Test {
	
	public static void main(String[] args) {
		
		GeneratoreOutfit gen = new GeneratoreOutfit();
		String vestito = gen.outfit();
		
		System.out.println(vestito);
	}

}

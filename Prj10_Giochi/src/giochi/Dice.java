package giochi;

public class Dice {
	
	static Dado d1 = new Dado();
	static Dado d2 = new Dado();
	static int successi = 0;
	
	public static String play() {
		
		d1.lancia();
		System.out.println(d1.getFaccia());
		
		d2.lancia();
		System.out.println(d2.getFaccia());
		
		if(d1.getFaccia()==d2.getFaccia()) {
			successi++;
			return "hai vinto";
		} 
			return "hai perso";
		
	}
	
	public static void main(String[] args) {
		int x = 1_000_000;
		long start = System.currentTimeMillis();
		for (int i = 0; i < x; i++) {
			System.out.println(play());
		}
		long stop = System.currentTimeMillis();
		System.out.println("Hai vinto: "+successi);
		double percentuale = (double)successi/x;
		System.out.println("Percuntuale successi: "+(percentuale*100)+'%');
		System.out.println("L'elaborazione è durata: "+(stop-start)+"ms");
		
	}
}

package forme;

public class Rettangolo {
	
	public double base, altezza;
	
	/**
	 * Costruttore del Rettangolo
	 * @param b inserisci il valore della base
	 * @param h inserisci il valore della altezza
	 */
	public Rettangolo(double b, double h) {
		
		base = b;
		altezza = h;
//		System.out.println("Ho costruito un rettangolo generico");
//		System.out.println("base = " + base);
//		System.out.println("altezza = " + altezza);
	}

	public double getPerimetro() {
//		double p = 2 * (base + altezza);
		return 2 * (base + altezza);
	}
	
	/**
	 * 
	 * @return Ritorna il valore della superficie
	 */
	public double getSuperficie() {
		return base * altezza;
	}
	
	public String getInfo() {
		return "Rettangolo" +
				"\n base " + base +
				"\n altezza " + altezza +
				"\n perimetro " + getPerimetro() +
				"\n area " + getSuperficie();
				 
	}
	
}

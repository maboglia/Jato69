package forme;

public class Rettangolo {
	
	public Segmento base, altezza;
	
	/**
	 * Costruttore del Rettangolo
	 * @param base inserisci il valore della base
	 * @param altezza inserisci il valore della altezza
	 */
	public Rettangolo(Segmento base, Segmento altezza) {
		
		this.base = base;
		this.altezza = altezza;
//		System.out.println("Ho costruito un rettangolo generico");
//		System.out.println("base = " + base);
//		System.out.println("altezza = " + altezza);
	}

	public double getPerimetro() {
//		double p = 2 * (base + altezza);
		return 2 * (base.lunghezza() + altezza.lunghezza());
	}
	
	/**
	 * 
	 * @return Ritorna il valore della superficie
	 */
	public double getSuperficie() {
		return base.lunghezza() * altezza.lunghezza();
	}

	@Override
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza=" + altezza + ", getPerimetro()=" + getPerimetro()
				+ ", getSuperficie()=" + getSuperficie() + "]";
	}
	
	
	
}

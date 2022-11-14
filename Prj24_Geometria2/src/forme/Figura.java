package forme;

public abstract class Figura {//non si possono istanziare oggetti

	protected String nome;
	
	protected double superficie;
	protected double perimetro;
	
	public double getSuperficie() {
		return this.superficie;
	}
	
	public abstract double calcolaSuperficie();
	
}

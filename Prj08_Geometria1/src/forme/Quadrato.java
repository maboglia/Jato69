package forme;

public class Quadrato extends Rettangolo {

	public Segmento lato;
	
	public Quadrato(Segmento lato) {
		super(lato, lato);//sto costruendo un rettangolo
		// TODO Auto-generated constructor stub
		this.lato = lato;
	}

	@Override
	public String toString() {
		return "Quadrato [lato=" + lato + ", toString()=" + super.toString() + "]";
	}

	
	public void stampaQuadrato() {
		System.out.println("sono il metodo stampa quadrato");
	}
	
	@Override
	public double getSuperficie() {
		System.out.println("metodo del quadrato");
		return this.lato.lunghezza() * this.lato.lunghezza();
	}

	
	
}

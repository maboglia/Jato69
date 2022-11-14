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

	
	
}

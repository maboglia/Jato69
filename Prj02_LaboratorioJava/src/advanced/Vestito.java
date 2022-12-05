package advanced;

public class Vestito {

	String tipo;
	double prezzo;
	Colore colore;
	Taglia taglia;

	public Vestito(String tipo, double prezzo, Taglia taglia) {
		this.tipo = tipo;
		this.prezzo = prezzo;
		this.taglia = taglia;
	}

	@Override
	public String toString() {
		return "Vestito [tipo=" + tipo + ", prezzo=" + prezzo + ", taglia=" + taglia.getMisura() + "]";
	}
	
	
}

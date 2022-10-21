package eccezioni;

public class Gatto {

	String eta;
	String etaUmana;

	public Gatto(String eta, String etaUmana) {
		this.eta = eta;
		this.etaUmana = etaUmana;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gatto [eta=");
		builder.append(eta);
		builder.append(", etaUmana=");
		builder.append(etaUmana);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
}

package model;

public class PostoDisabile extends Posto {

	private String disabilita;
	
	public PostoDisabile(int fila, int numero, String tipo) {
		super(fila, numero, tipo);
		// TODO Auto-generated constructor stub
	}

	public String getDisabilita() {
		return disabilita;
	}

	public void setDisabilita(String disabilita) {
		this.disabilita = disabilita;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PostoDisabile [disabilita=");
		builder.append(disabilita);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
	

}

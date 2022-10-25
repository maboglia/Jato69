package model;

import java.util.ArrayList;

public class Teatro {

	private String nome;
	private ArrayList<Posto> posti;
	
	
	
	public Teatro(String nome, ArrayList<Posto> posti) {//dependency injection
		super();
		this.nome = nome;
		this.posti = posti;
	}

	public Teatro(String nome) {
		super();
		this.nome = nome;
		this.posti = new ArrayList<Posto>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Posto> getPosti() {
		return posti;
	}

	public void setPosti(ArrayList<Posto> posti) {
		this.posti = posti;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teatro [nome=");
		builder.append(nome);
		builder.append(" numero di posti " + posti.size());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}

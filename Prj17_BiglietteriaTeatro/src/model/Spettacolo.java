package model;

import java.util.Arrays;

public class Spettacolo {

	private String titolo;
	private String nomeRegista;
	private String[] attori;
	
	public Spettacolo(String titolo, String nomeRegista, String[] attori) {
		super();
		this.titolo = titolo;
		this.nomeRegista = nomeRegista;
		this.attori = attori;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getNomeRegista() {
		return nomeRegista;
	}
	public void setNomeRegista(String nomeRegista) {
		this.nomeRegista = nomeRegista;
	}
	public String[] getAttori() {
		return attori;
	}
	public void setAttori(String[] attori) {
		this.attori = attori;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Spettacolo [titolo=");
		builder.append(titolo);
		builder.append(", nomeRegista=");
		builder.append(nomeRegista);
		builder.append(", attori=");
		builder.append(Arrays.toString(attori));
		builder.append("]");
		return builder.toString();
	}
	
	
	
}

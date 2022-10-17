package model;

public class Paziente {

	private String nome;
	private String cognome;
	private String codFiscale;
	
	public Paziente(String nome, String cognome, String codFiscale) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.codFiscale = codFiscale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodFiscale() {
		return codFiscale;
	}

	public void setCodFiscale(String codFiscale) {
		this.codFiscale = codFiscale;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paziente [nome=");
		builder.append(nome);
		builder.append(", cognome=");
		builder.append(cognome);
		builder.append(", codFiscale=");
		builder.append(codFiscale);
		builder.append("]");
		return builder.toString();
	}
	
	
}

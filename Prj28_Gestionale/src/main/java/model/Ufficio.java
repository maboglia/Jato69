package model;

public class Ufficio {
	private int id;
	private String nome;
	private String telefono;
	private String indirizzo;
	private String citta;
	private String regione;

	public Ufficio(int id, String nome, String telefono, String indirizzo, String citta, String regione) {
		this.id = id;
		this.nome = nome;
		this.telefono = telefono;
		this.indirizzo = indirizzo;
		this.citta = citta;
		this.regione = regione;
	}

	public Ufficio(String nome, String telefono, String indirizzo, String citta, String regione) {
		super();
		this.nome = nome;
		this.telefono = telefono;
		this.indirizzo = indirizzo;
		this.citta = citta;
		this.regione = regione;
	}

	public Ufficio() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ufficio [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", telefono=");
		builder.append(telefono);
		builder.append(", indirizzo=");
		builder.append(indirizzo);
		builder.append(", citta=");
		builder.append(citta);
		builder.append(", regione=");
		builder.append(regione);
		builder.append("]");
		return builder.toString();
	}

}
package model;

public class Cliente {
	
	private int id;
	private String nome;
	private String cognome;
	private String telefono;
	private String email;
	private String indirizzo;
	private String citta;
	private String provincia;
	private String regione;
	private int credito;
	
	public Cliente() {
	}

	public Cliente(String nome, String cognome, String telefono, String email, String indirizzo, String citta,
			String provincia, String regione, int credito) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
		this.email = email;
		this.indirizzo = indirizzo;
		this.citta = citta;
		this.provincia = provincia;
		this.regione = regione;
		this.credito = credito;
	}
	
	

	public Cliente(String nome, String cognome, String telefono, String email, String indirizzo, String città,
			String provincia, String regione) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
		this.email = email;
		this.indirizzo = indirizzo;
		this.citta = città;
		this.provincia = provincia;
		this.regione = regione;
		this.credito=0;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getCittà() {
		return citta;
	}

	public void setCittà(String città) {
		this.citta = città;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente --- Nome=");
		builder.append(nome);
		builder.append(", Cognome=");
		builder.append(cognome);
		builder.append(", Telefono=");
		builder.append(telefono);
		builder.append(", Email=");
		builder.append(email);
		builder.append(", Indirizzo=");
		builder.append(indirizzo);
		builder.append(", Città=");
		builder.append(citta);
		builder.append(", Provincia=");
		builder.append(provincia);
		builder.append(", Regione=");
		builder.append(regione);
		return builder.toString();
	}
	
	
	
}

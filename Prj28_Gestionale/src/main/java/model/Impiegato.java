package model;

public class Impiegato {

	private int id;
	private String nome;
	private String cognome;
	private String ruolo;
	private Impiegato rif_to;
	private double stipendio;
	private int ufficio_id;
	// private Ufficio ufficio_id;
	
	public Impiegato(int id, String nome, String cognome, String ruolo, Impiegato rif_to, double stipendio, int ufficio_id) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.ruolo = ruolo;
		this.rif_to = rif_to;
		this.stipendio = stipendio;
		this.ufficio_id = ufficio_id;
	}
	
	public Impiegato() {
		super();
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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public Impiegato getRif_to() {
		return rif_to;
	}

	public void setRif_to(Impiegato rif_to) {
		this.rif_to = rif_to;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	public int getUfficio_id() {
		return ufficio_id;
	}

	public void setUfficio_id(int ufficio_id) {
		this.ufficio_id = ufficio_id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Impiegato [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", cognome=");
		builder.append(cognome);
		builder.append(", ruolo=");
		builder.append(ruolo);
		builder.append(", rif_to=");
		builder.append(rif_to);
		builder.append(", stipendio=");
		builder.append(stipendio);
		builder.append(", ufficio_id=");
		builder.append(ufficio_id);
		builder.append("]");
		return builder.toString();
	}
		
}

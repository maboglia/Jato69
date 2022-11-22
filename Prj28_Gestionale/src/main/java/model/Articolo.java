package model;

public class Articolo {

	private int id;
	private String descrizione;
	private double prezzo;
	private String categoria;
	private int rimanenza;
	
	public Articolo(int id, String descrizione, double prezzo, String categoria, int rimanenza) {
		super();
		this.id = id;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.categoria = categoria;
		this.rimanenza = rimanenza;
	}

	public Articolo(String descrizione, double prezzo, String categoria, int rimanenza) {
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.categoria = categoria;
		this.rimanenza = rimanenza;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getRimanenza() {
		return rimanenza;
	}

	public void setRimanenza(int rimanenza) {
		this.rimanenza = rimanenza;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Articolo [id=");
		builder.append(id);
		builder.append(", descrizione=");
		builder.append(descrizione);
		builder.append(", prezzo=");
		builder.append(prezzo);
		builder.append(", categoria=");
		builder.append(categoria);
		builder.append(", rimanenza=");
		builder.append(rimanenza);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}

package model;

public class Appuntamento {

	private String descrizione;

	public Appuntamento(String descrizione) {
		super();
		this.descrizione = descrizione;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		return "Appuntamento [descrizione=" + descrizione + "]";
	}
	
}

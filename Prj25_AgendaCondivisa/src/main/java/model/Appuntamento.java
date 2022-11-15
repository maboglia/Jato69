package model;

import java.time.LocalTime;

public class Appuntamento {
	
	//private int id;
	private String descrizione;
	private LocalTime ora;

	public Appuntamento(String descrizione) {
		super();
		this.descrizione = descrizione;
		this.ora= LocalTime.now();
		
	}
	

	public Appuntamento(String descrizione, LocalTime ora) {
		super();
		this.descrizione = descrizione;
		this.ora = ora;
	}


	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public LocalTime getOra() {
		return ora;
	}

	public void setOra(LocalTime ora) {
		this.ora = ora;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Appuntamento [descrizione=");
		builder.append(descrizione);
		builder.append(", ora=");
		builder.append(ora);
		builder.append("]");
		return builder.toString();
	}

	
	
}

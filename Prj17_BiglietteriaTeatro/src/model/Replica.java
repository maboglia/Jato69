package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Replica {

	private Spettacolo spettacolo;
	private LocalDate dataSpettacolo;
	private LocalTime oraSpettacolo;
	private Teatro teatro;
	public Replica(Spettacolo spettacolo, LocalDate dataSpettacolo, LocalTime oraSpettacolo, Teatro teatro) {
		super();
		this.spettacolo = spettacolo;
		this.dataSpettacolo = dataSpettacolo;
		this.oraSpettacolo = oraSpettacolo;
		this.teatro = teatro;
	}
	public Spettacolo getSpettacolo() {
		return spettacolo;
	}
	public void setSpettacolo(Spettacolo spettacolo) {
		this.spettacolo = spettacolo;
	}
	public LocalDate getDataSpettacolo() {
		return dataSpettacolo;
	}
	public void setDataSpettacolo(LocalDate dataSpettacolo) {
		this.dataSpettacolo = dataSpettacolo;
	}
	public LocalTime getOraSpettacolo() {
		return oraSpettacolo;
	}
	public void setOraSpettacolo(LocalTime oraSpettacolo) {
		this.oraSpettacolo = oraSpettacolo;
	}
	public Teatro getTeatro() {
		return teatro;
	}
	public void setTeatro(Teatro teatro) {
		this.teatro = teatro;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Replica [spettacolo=");
		builder.append(spettacolo);
		builder.append(", dataSpettacolo=");
		builder.append(dataSpettacolo);
		builder.append(", oraSpettacolo=");
		builder.append(oraSpettacolo);
		builder.append(", teatro=");
		builder.append(teatro);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}

package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Prenotazione {

	private String nome;
	private Replica replica;
	private LocalDate dataPrenotazione;
	private ArrayList<Posto> postiPrenotati;
	
	public Prenotazione(String nome, Replica replica, ArrayList<Posto> postiPrenotati) {
		super();
		this.nome = nome;
		this.replica = replica;
		this.postiPrenotati = postiPrenotati;
		this.dataPrenotazione = LocalDate.now();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Replica getReplica() {
		return replica;
	}

	public void setReplica(Replica replica) {
		this.replica = replica;
	}

	public LocalDate getDataPrenotazione() {
		return dataPrenotazione;
	}

	public void setDataPrenotazione(LocalDate dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}

	public ArrayList<Posto> getPostiPrenotati() {
		return postiPrenotati;
	}

	public void setPostiPrenotati(ArrayList<Posto> postiPrenotati) {
		this.postiPrenotati = postiPrenotati;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Prenotazione [nome=");
		builder.append(nome);
		builder.append(", replica=");
		builder.append(replica);
		builder.append(", dataPrenotazione=");
		builder.append(dataPrenotazione);
		builder.append(", postiPrenotati=");
		builder.append(postiPrenotati);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}

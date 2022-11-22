package model;

import java.util.Date;

public class Ordine {
	
	private int id;
	private int cliente_id; 
	private int impiegato_id;
	private Date data;
	private String statoConsegna;
	
	public Ordine(int id, int cliente_id, int impiegato_id, Date data, String statoConsegna) {
		this.id = id;
		this.cliente_id = cliente_id;
		this.impiegato_id = impiegato_id;
		this.data = data;
		this.statoConsegna = statoConsegna;
	}

	
	public Ordine(int cliente_id, int impiegato_id, Date data, String statoConsegna) {
		this.cliente_id = cliente_id;
		this.impiegato_id = impiegato_id;
		this.data = data;
		this.statoConsegna = statoConsegna;
	}


	public int getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}

	public int getImpiegato_id() {
		return impiegato_id;
	}

	public void setImpiegato_id(int impiegato_id) {
		this.impiegato_id = impiegato_id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getId() {
		return id;
	}
	public String getStatoConsegna() {
		return statoConsegna;
	}
	public void setStatoConsegna(String statoConsegna) {
		this.statoConsegna = statoConsegna;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ordine [id=");
		builder.append(id);
		builder.append(", cliente_id=");
		builder.append(cliente_id);
		builder.append(", impiegato_id=");
		builder.append(impiegato_id);
		builder.append(", data=");
		builder.append(data);
		builder.append(", statoConsegna=");
		builder.append(statoConsegna);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
//
// enum StatoConsegna {
//	CONSEGNATO("consegnato"),
//	DASPEDIRE("da spedire"),
//	SPEDITO("spedito");
//	
//	public String stato;
//		StatoConsegna(String stato) {
//			this.stato=stato;
//		}
//		public String toString() {
//			return stato;
//		}
//	};
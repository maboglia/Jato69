package model;

public class Biglietto {

	private Replica replica;
	private Posto posto;
	private double costo;
	
	public Biglietto(Replica replica, Posto posto) {
		super();
		this.replica = replica;
		this.posto = posto;
	}

	public Replica getReplica() {
		return replica;
	}

	public void setReplica(Replica replica) {
		this.replica = replica;
	}

	public Posto getPosto() {
		return posto;
	}

	public void setPosto(Posto posto) {
		this.posto = posto;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
	
}

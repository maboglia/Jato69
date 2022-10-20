package classi;

public class Automobile {

	private String marca;
	private String modello;
	private boolean accesa;
	
	public Automobile(String marca, String modello) {
		this.marca = marca;
		this.modello = modello;
		this.accesa = false;
	}
	
	
	public Automobile(String marca, String modello, boolean accesa) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.accesa = accesa;
	}




	public void accendi() {
		this.accesa = true;
	}
	
	public void accendi(int i) {
		System.out.println("è già a palla");
		this.accesa = true;
	}
	
	public void spegni() {
		this.accesa = false;
	}
	
	public String stampa() {
		
		return "Questa automobile è di marca: " + this.marca
				+ " e modello: " + this.modello
				+ " ed è accesa: " + this.accesa;
		
	}
	
	
}

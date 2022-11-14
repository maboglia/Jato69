package model;

public class Dirigente extends Dipendente {

	private double emolumenti;
	
	public Dirigente(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	

	public double getEmolumenti() {
		return emolumenti;
	}



	public void setEmolumenti(double emolumenti) {
		this.emolumenti = emolumenti;
	}



	@Override
	public double calcolaStipendio() {
		// TODO Auto-generated method stub
		return this.emolumenti;
	}

}

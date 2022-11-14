package model;

public class Impiegato extends Dipendente {

	private int oreLavoro;
	
	
	public Impiegato(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	
	public int getOreLavoro() {
		return oreLavoro;
	}

	public void setOreLavoro(int oreLavoro) {
		this.oreLavoro = oreLavoro;
	}


	@Override
	public double calcolaStipendio() {
		return this.oreLavoro * 9.5;
	}

}

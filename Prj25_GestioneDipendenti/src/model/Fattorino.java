package model;

public class Fattorino extends Dipendente implements Stagionale{

	private int nConsegne;
	
	
	public Fattorino(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	
	
	public int getnConsegne() {
		return nConsegne;
	}



	public void setnConsegne(int nConsegne) {
		this.nConsegne = nConsegne;
	}



	@Override
	public double calcolaStipendio() {
		// TODO Auto-generated method stub
		return this.nConsegne  * 5.5;
	}



	@Override
	public void quandoLavora(String periodo) {
		System.out.println("Lavora nel periodo " + periodo);
		
	}

	

}

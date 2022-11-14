package model;

public abstract class Dipendente {

	private static int counter = 1;
	
	protected int nMatricola;
	protected String nome;
	
	public Dipendente(String nome) {
		this.nMatricola = counter++;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getnMatricola() {
		return nMatricola;
	}
	
	public abstract double calcolaStipendio();

	@Override
	public String toString() {
		return "Dipendente [nMatricola=" + nMatricola + ", nome=" + nome + "]";
	}
	
	
	
}

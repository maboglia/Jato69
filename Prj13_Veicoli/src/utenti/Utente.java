package utenti;

public class Utente {

	private String nome;

	public Utente(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Utente [nome=" + nome + "]";
	}
	


	
}

package aula;

public class Studente {

	String nome;
	String cognome;
	
	public String getStudente() {
		return nome + " " + cognome.toUpperCase();
	}
	
	public void setStudente(String ilNome, String ilCognome) {
		nome = ilNome;
		cognome = ilCognome;
	}
}

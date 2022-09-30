package aula;

public class Studente {

	static int matricolatore = 0;
	
	int matricola;
	String nome;
	String cognome;
	
	public Studente(String n, String c) {
//		nome = n;
//		cognome = c;
		
		matricola = ++matricolatore;
		
		setStudente(n, c); 
		
	}
	
	public String getStudente() {
		return nome + " " + cognome.toUpperCase();
	}
	
	public void setStudente(String ilNome, String ilCognome) {
		nome = ilNome;
		cognome = ilCognome;
	}
}

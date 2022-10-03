package vestiti;

public class Scarpa {
	
	public Scarpa(String nome, String colore) {
		
		this.nome = nome;
		this.colore = colore;
	
	}
	
public String etichetta() {
		
		return this.nome + " " + this.colore; 
		
	}
	public String colore;
	public String nome;

}

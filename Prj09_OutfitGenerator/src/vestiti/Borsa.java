package vestiti;

public class Borsa {
	
	public String colore;
	public String nome;
	
	public Borsa(String nome, String colore) {
		
		this.nome = nome;
		this.colore = colore;
		
	}
	
	public String etichetta() {
		
		return this.nome + " " + this.colore; 
		
	}
	
	

}

package vestiti;

public class Cappello {
	
	public Cappello(String nome, String colore) {
		
		this.nome = nome;
		this.colore = colore;
		
	}
	
public String etichetta() {
		
		return this.nome + " " + this.colore; 
		
	}
	public String colore;
	public String nome;

}

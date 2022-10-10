package veicoli;

public class Bicicletta {

	//proprietà 
	private String colore;
	private String nome;
	private int marcia;
	
	//metodi
	//metodo costruttore
	public Bicicletta() {
		this.colore = "bianco";
		this.nome = "bianchi";
		this.marcia = 1;
	}

	//metodi custom
	public void cambiaColore(String colore) {
		this.colore = colore;
	}

	public void cambiaMarcia(int marcia) {
		if (marcia > 0 && marcia <=6)
			this.marcia = marcia;
		else 
			System.out.println("non puoi mettere la " + marcia);
	}
	
	public void cambiaNome(String nome) {
		this.nome = nome;
	}
	
	//metodo tostring
	@Override
	public String toString() {
		return "La Bicicletta di " + this.nome 
				+ " è di colore " + this.colore 
				+ ", adesso è in " + this.marcia + " marcia]";
	}
	
	
}

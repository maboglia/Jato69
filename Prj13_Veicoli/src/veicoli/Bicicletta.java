package veicoli;

public class Bicicletta {

	//proprietà 
	private String colore;
	private String nome;
	private int marcia;
	private double prezzoNoleggioOrario;
	
	//metodi
	//metodo costruttore
	public Bicicletta() {
		this.colore = "bianco";
		this.nome = "standard";
		this.marcia = 1;
		this.prezzoNoleggioOrario = 10;
	}

	
	public Bicicletta(String nome, double prezzoNoleggioOrario) {
		this.colore = "bianco";
		this.marcia = 1;
		this.nome = nome;
		this.prezzoNoleggioOrario = prezzoNoleggioOrario;
	}
	
	//metodi custom




	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMarcia() {
		return marcia;
	}

	public void setMarcia(int marcia) {
		if (marcia > 0 && marcia <= 6) {
			this.marcia = marcia;
			//altre istruzioni
		}
	}

	public double getPrezzoNoleggioOrario() {
		return prezzoNoleggioOrario;
	}

	public void setPrezzoNoleggioOrario(double prezzoNoleggioOrario) {
		this.prezzoNoleggioOrario = prezzoNoleggioOrario;
	}
	
	
	
	
	//metodo tostring
	@Override
	public String toString() {
		return "La Bicicletta di " + this.nome 
				+ " è di colore " + this.colore 
				+ ", adesso è in " + this.marcia + " marcia]";
	}

	
	
}

package prodotti;

public class Prodotto {
	private int codiceProdotto;
	private String nome;
	private double prezzo;
	
	public Prodotto(int codiceProdotto, String nome, double prezzo) {
		super();
		this.codiceProdotto = codiceProdotto;
		this.nome = nome;
		this.prezzo = prezzo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getCodiceProdotto() {
		return codiceProdotto;
	}

	@Override
	public String toString() {
		return "Prodotto [codiceProdotto=" + codiceProdotto +
				", nome=" + nome + 
				", prezzo=" + prezzo + "]";
	}
	
	
	
	
}

package prodotti;

public class Articolo {
	private Prodotto prodotto;
	private int quantita;
	private double prezzoArticolo;
	
	public Articolo(Prodotto prodotto, int quantita) {
		super();
		this.prodotto = prodotto;
		this.quantita = quantita;
		this.prezzoArticolo = prodotto.getPrezzo()*quantita;
	}
	
	public double getPrezzoArticolo() {
		return prezzoArticolo;
	}
	
	public Prodotto getProdotto() {
		return prodotto;
	}

	public int getQuantita() {
		return quantita;
	}

	@Override
	public String toString() {
		return "Articolo [prodotto=" + prodotto + 
				", quantita=" + quantita + 
				", prezzo="+ prezzoArticolo + "]";
	}
	
	
	
}

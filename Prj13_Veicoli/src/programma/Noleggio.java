package programma;

import java.time.LocalDateTime;

import utenti.Utente;
import veicoli.Bicicletta;

public class Noleggio {

	private LocalDateTime data;
	private Bicicletta bici;
	private Utente utente;
	private int dalleOre;
	private int alleOre;
	private double prezzo;
	private boolean pagato;
	
	public Noleggio(Bicicletta bici, Utente utente, int dalleOre, int alleOre) {

		this.bici = bici;
		this.utente = utente;
		this.dalleOre = dalleOre;
		this.alleOre = alleOre;
		this.pagato = false;

	}
	
	public void pagamento() {
		
		this.data = LocalDateTime.now();
		this.pagato = true;
		
	}
	
	public double calcolaPrezzo() {
		
		double prezzoBici = this.bici.getPrezzoNoleggioOrario();
		int oreUso = this.alleOre - this.dalleOre;
		this.prezzo = prezzoBici * oreUso;
		return this.prezzo;
		
	}

	@Override
	public String toString() {
		return "Noleggio [data=" + data + ", bici=" + bici.getNome() + ", utente=" + utente.getNome() + ", dalleOre=" + dalleOre
				+ ", alleOre=" + alleOre + ", prezzo=" + prezzo + ", pagato=" + pagato + "]";
	}
	
	
	
}

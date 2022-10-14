package logica;

import java.time.LocalDateTime;
import java.util.Arrays;

import prodotti.Articolo;

public class Scontrino {
	private Articolo[] articoli;
	private LocalDateTime data;
	private int numeroScontrino;
	
	public Scontrino(Articolo[] articoli, int numeroScontrino) {
		super();
		this.articoli = articoli;
		this.data= LocalDateTime.now();
		this.numeroScontrino = numeroScontrino;
	}

	@Override
	public String toString() {
		return "Scontrino [articoli=" + Arrays.toString(articoli) + 
				", data=" + data + 
				", numeroScontrino="+ numeroScontrino + "]";
	}

	
}

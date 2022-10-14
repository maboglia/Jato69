package logica;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

import prodotti.Articolo;

public class Scontrino {

	private static int numeratore = 1;
	
	private ArrayList<Articolo> articoli;
	private LocalDateTime data;
	private int numeroScontrino;
	
	
	public Scontrino() {
		this.data = LocalDateTime.now();
		this.articoli = new ArrayList<Articolo>();
		this.numeroScontrino = numeratore++;
	}
	
	public Scontrino(ArrayList<Articolo> articoli) {//overload del costruttore
		this.data = LocalDateTime.now();
		this.articoli = articoli;
		this.numeroScontrino = numeratore++;
	}
	
	public void addArticolo(Articolo a) {
		this.articoli.add(a);
	}
	
	public double getTotaleScontrino() {
		double totale = 0;
		for (Articolo articolo : articoli) {
			totale += articolo.getPrezzoArticolo();
		}
		return totale;
	}
	
	public int getNumeroArticoli() {
		return this.articoli.size();
	}
	
	public ArrayList<Articolo> getArticoli(){
		return this.articoli;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append("\n************************\n");
		builder.append("Data: ");
		builder.append(data);
		builder.append(", numero ");
		builder.append(numeroScontrino);
		builder.append("\n************************\n");

		builder.append("\n************************\n");
		builder.append("Totale ");
		builder.append(getTotaleScontrino());
		builder.append("\n************************\n");
		builder.append("Numero Articoli ");
		builder.append(getNumeroArticoli());
		
		builder.append("\n************************\n");
		
		for (Articolo articolo : articoli) {
			builder.append(articolo.getProdotto().getNome());
			builder.append("\t");
			builder.append(articolo.getProdotto().getPrezzo());
			builder.append("\t");
			builder.append(articolo.getQuantita());
			builder.append("\t");
			builder.append(articolo.getPrezzoArticolo());
			builder.append("\n");

		}
		
		
		return builder.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

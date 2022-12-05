package com.mauro.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "canzoni")
public class Canzone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titolo;
	private String autore;
	private String genere;
	private int anno;
	
	public Canzone() {//costruttore senza parametri: ne ha bisogno spring
		System.out.println("oggetto canzone costruito da Spring");
	}
	
	
	
	public Canzone(int id, String titolo, String autore, String genere, int anno) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
		this.genere = genere;
		this.anno = anno;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	@Override
	public String toString() {
		return "Canzone [id=" + id + ", titolo=" + titolo + ", autore=" + autore + ", genere=" + genere + ", anno="
				+ anno + "]";
	}
	
	
	
}

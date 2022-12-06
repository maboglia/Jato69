package com.mauro.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "viaggi")
public class Viaggio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String destinazione;
	
	//@OneToOne(mappedBy = "viaggio", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@OneToMany(mappedBy = "viaggio", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Documento> documento;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public Set<Documento> getDocumento() {
		return documento;
	}

	public void setDocumento(Set<Documento> documento) {
		this.documento = documento;
	}

	
	
	
}

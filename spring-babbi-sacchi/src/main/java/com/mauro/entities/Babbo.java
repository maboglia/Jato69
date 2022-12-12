package com.mauro.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "babbi")
public class Babbo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "babbi_sacchi", 
		joinColumns = {
				@JoinColumn(name="babbo_id", referencedColumnName = "id",
						nullable = false, updatable = false)},
		inverseJoinColumns = {
				@JoinColumn(name="sacco_id", referencedColumnName = "id",
						nullable = false, updatable = false)
		})
	private Set<Sacco> sacchi = new HashSet<>();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


}

package com.mauro.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "consegne")
public class Consegna {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
}

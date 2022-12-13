package com.mauro.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
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
	
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	private Date data;
//	
	
	@Column(columnDefinition = "DATE")
	@DateTimeFormat(iso = ISO.DATE_TIME)
	LocalDateTime data;
	
	@Column(columnDefinition = "TIME")
	@DateTimeFormat(iso=ISO.TIME)
	LocalTime oraConsegna;
	
	
	
}

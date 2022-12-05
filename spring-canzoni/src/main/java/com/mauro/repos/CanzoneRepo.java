package com.mauro.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mauro.entities.Canzone;

@Repository
public interface CanzoneRepo extends JpaRepository<Canzone, Integer> {

	List<Canzone> findByTitoloContaining(String titolo);
	List<Canzone> findByAutoreLike(String autore);
	
}

package com.mauro.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauro.entities.Sacco;

public interface SaccoDAO extends JpaRepository<Sacco, Integer> {

}

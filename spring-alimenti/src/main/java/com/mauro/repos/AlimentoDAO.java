package com.mauro.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauro.entities.Alimento;

public interface AlimentoDAO extends JpaRepository<Alimento, Integer> {

}

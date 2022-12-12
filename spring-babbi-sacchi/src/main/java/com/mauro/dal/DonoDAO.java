package com.mauro.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauro.entities.Dono;

public interface DonoDAO extends JpaRepository<Dono, Integer> {

}

package com.mauro.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauro.entities.Babbo;

public interface BabboDAO extends JpaRepository<Babbo, Integer> {

}

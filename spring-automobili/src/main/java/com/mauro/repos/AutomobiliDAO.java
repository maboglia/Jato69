package com.mauro.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mauro.model.Automobile;

@Repository
public interface AutomobiliDAO extends JpaRepository<Automobile, Integer> {

}

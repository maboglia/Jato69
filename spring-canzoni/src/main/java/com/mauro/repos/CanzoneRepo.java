package com.mauro.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mauro.entities.Canzone;

@Repository
public interface CanzoneRepo extends JpaRepository<Canzone, Integer> {

}

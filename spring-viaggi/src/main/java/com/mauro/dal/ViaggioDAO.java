package com.mauro.dal;

import org.springframework.data.repository.CrudRepository;

import com.mauro.entities.Viaggio;

public interface ViaggioDAO extends CrudRepository<Viaggio, Integer>{

}

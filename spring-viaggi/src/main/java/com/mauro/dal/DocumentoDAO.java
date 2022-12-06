package com.mauro.dal;

import org.springframework.data.repository.CrudRepository;

import com.mauro.entities.Documento;

public interface DocumentoDAO extends CrudRepository<Documento, Integer> {

}

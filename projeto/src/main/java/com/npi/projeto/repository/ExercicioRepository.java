package com.npi.projeto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.npi.projeto.model.Exercicio;

@Repository
public interface ExercicioRepository extends CrudRepository<Exercicio, Long>{

}

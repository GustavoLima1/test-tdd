package com.Tdd.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Tdd.teste.model.ContatoModel;


public interface ContatoRepository extends JpaRepository<ContatoModel, Long>{
	

	
}

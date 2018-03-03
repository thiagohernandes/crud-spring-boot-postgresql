package com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.domain.Funcionario;

/** 
 * Repositório JPA da classe Funcionário
 * @author Thiago Hernandes de Souza
 * @since 03-03-2018
 * */

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

}
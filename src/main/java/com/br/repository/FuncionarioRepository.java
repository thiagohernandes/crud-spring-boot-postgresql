package com.br.repository;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.domain.Funcionario;

/** 
 * Repositório JPA da classe Funcionário
 * @author Thiago Hernandes de Souza
 * @since 03-03-2018
 * */

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

	@Query(value=   "select f FROM Funcionario f")
	public List<Funcionario> funcionarios();
	
	@Query(value=   " select f.nome as dsFuncionario, " + 
					"		d.nome as dsDepartamento " + 
					" from departamento d inner join funcionario f" + 
					" on f.id_departamento = d.id " + 
					" group by d.nome,f.nome" +
					" order by d.nome,f.nome", nativeQuery=true)
	public List<Object> relDeptoFuncionario();
	
	
}
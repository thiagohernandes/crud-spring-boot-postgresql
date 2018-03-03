package com.br.domain;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/** 
 * Classe/objeto funcionário
 * @author Thiago Hernandes de Souza
 * @since 03-03-2018
 * */

@Entity
@Table(schema="public", name="funcionario")
@JsonInclude(Include.ALWAYS)
public class Funcionario {

	private Integer id;
	private String nome;
	private Date nascimento;
	private BigDecimal salario;
	
	public Funcionario() {
		
	}
	
	public Funcionario(Integer id, String nome, Date nascimento, BigDecimal salario) {
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
		this.salario = salario;
	}

	@Id
	@SequenceGenerator(name="seq-gen",sequenceName="funcionario_id_seq")
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
}

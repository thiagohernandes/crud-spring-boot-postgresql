package com.br.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/** 
 * Classe/objeto funcionário
 * @author Thiago Hernandes de Souza
 * @since 010-03-2018
 * */

@Entity
@Table(schema="public", name="departamento")
@JsonInclude(Include.ALWAYS)
@SequenceGenerator(name="seq-gen", allocationSize=1)
public class Departamento {

	private Integer id;
	private String nome;
	private List<Funcionario> funcionariosDepto;
	
	public Departamento() {
		
	}
	
	public Departamento(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	@Id
	@SequenceGenerator(name="seq-gen",sequenceName="departamento_id_seq")
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

	@OneToMany(mappedBy="departamento",fetch=FetchType.LAZY)
	public List<Funcionario> getFuncionariosDepto() {
		return funcionariosDepto;
	}

	public void setFuncionariosDepto(List<Funcionario> funcionariosDepto) {
		this.funcionariosDepto = funcionariosDepto;
	}

}

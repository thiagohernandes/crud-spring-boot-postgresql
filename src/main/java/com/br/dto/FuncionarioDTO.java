package com.br.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class FuncionarioDTO {
	
	private String dsFuncionario;
	private String dsDepartamento;
	
	public FuncionarioDTO(String dsFuncionario, String dsDepartamento) {
		this.dsFuncionario = dsFuncionario;
		this.dsDepartamento = dsDepartamento;
	}

	public String getDsFuncionario() {
		return dsFuncionario;
	}

	public void setDsFuncionario(String dsFuncionario) {
		this.dsFuncionario = dsFuncionario;
	}

	public String getDsDepartamento() {
		return dsDepartamento;
	}

	public void setDsDepartamento(String dsDepartamento) {
		this.dsDepartamento = dsDepartamento;
	}

}

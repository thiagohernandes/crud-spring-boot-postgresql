package com.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.domain.Funcionario;
import com.br.repository.FuncionarioRepository;

/** 
 * Serviços REST da classe funcionário
 * @author Thiago Hernandes de Souza
 * @since 03-03-2018
 * */

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {
	
	@Autowired
	FuncionarioRepository repository;
	
	@GetMapping("/todos")
	public List<Funcionario> todos(){
		return repository.findAll(); 
	}
	
	@ResponseBody
	@PostMapping("/novo")
	public Funcionario novo(@RequestBody Funcionario funcionario) {
	return repository.save(funcionario);
	}
	
	@GetMapping(value="/{id}")
	public Funcionario getFuncionario(@PathVariable("id") Integer id) {
		return repository.findOne(id);
	}
	
	@ResponseBody
	@PutMapping(value="/alterar/{id}")
	public Funcionario alterarFuncionario(@PathVariable("id") Integer id, @RequestBody Funcionario funcionario ) {
		return repository.save(funcionario);
	}
	
	@DeleteMapping(value="/apagar/{id}")
	public void excluirFuncionario(@PathVariable("id") Integer id) {
		repository.delete(id);
	}



}

package com.br.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.br.domain.Funcionario;
import com.br.repository.FuncionarioRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestsFuncionario {

	@Autowired
	private FuncionarioRepository repository;
	
	@Test
	public void test1(){
		List<Funcionario> consulta = repository.findWithNativeQuery();
		for(Funcionario u : consulta) {
			// System.out.println(u.getNome()+ " - "+ u.getDepartamento().getNome());
			System.out.println(u.getNome());
		}
		assertNotNull(consulta);
		assertTrue(!consulta.isEmpty());
	}
	
}

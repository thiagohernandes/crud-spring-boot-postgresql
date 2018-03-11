package com.br.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.br.domain.Funcionario;
import com.br.dto.FuncionarioDTO;
import com.br.repository.FuncionarioRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestsFuncionario {

	@Autowired
	private FuncionarioRepository repository;
	
	@Test
	public void test1(){
		List<Funcionario> consulta = repository.funcionarios();
		for(Funcionario u : consulta) {
			// System.out.println(u.getNome()+ " - "+ u.getDepartamento().getNome());
			System.out.println(u.getNome());
		}
		assertNotNull(consulta);
		assertTrue(!consulta.isEmpty());
	}
	
	@Test
	public void test2(){
		List<Object> consulta = repository.relDeptoFuncionario();
		for (int i=0; i<consulta.size(); i++){
			 Object[] row = (Object[]) consulta.get(i);
			   System.out.println("Funcionário: "+i+row[0]+" Departamento: "+row[1]);
		}
		assertNotNull(consulta);
		assertTrue(!consulta.isEmpty());
	}
	
	@Test
	public void test3(){
		List<Object> consulta = repository.relDeptoFuncionario();
		for (int i=0; i<consulta.size(); i++){
			 Object[] row = (Object[]) consulta.get(i);
			 FuncionarioDTO f =new FuncionarioDTO(row[0].toString(),row[1].toString());
			 System.out.println(f.getDsFuncionario()+" ----- "+f.getDsDepartamento());
		}
		assertNotNull(consulta);
		assertTrue(!consulta.isEmpty());
	}
	
}

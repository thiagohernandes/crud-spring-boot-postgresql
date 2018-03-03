package com.br;

import java.util.Date;
import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/** 
 * Classe principal da aplicação
 * @author Thiago Hernandes de Souza
 * @since 03-03-2018
 * */

@SpringBootApplication
@ComponentScan
public class App {
	
	@PostConstruct
    public void init(){
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));  
        System.out.println("Spring boot application running in UTC timezone :"+new Date());  
    }
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}

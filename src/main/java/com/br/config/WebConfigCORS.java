package com.br.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/** 
 * Habilitando CORS para acesso de aplicações 
 * @author Thiago Hernandes de Souza
 * @since 03-03-2018
 * */

@Configuration
@EnableWebMvc
public class WebConfigCORS extends WebMvcConfigurerAdapter {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
	/*registry.addMapping("/api/**")
	.allowedOrigins("http://localhost:4200").allowedOrigins("http://localhost:8080")
	.allowedMethods("*")
	.allowedHeaders("*")
	.allowCredentials(false)
	.maxAge(3600);*/
	}
}
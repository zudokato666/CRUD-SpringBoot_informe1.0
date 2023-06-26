package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.Informe;
import com.app.web.repositorio.InformeRepositorio;

@SpringBootApplication
public class CrudSpringBootApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootApplication.class, args);
	}

	@Autowired
	private InformeRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
/*
		Informe informe1 = new Informe("ventas","todas las ventas","24/02/2022");
	    repositorio.save(informe1);
	    
	    Informe informe2 = new Informe("Compras","todas las compras","12/08/2021");
	    repositorio.save(informe2);
*/
	}

}

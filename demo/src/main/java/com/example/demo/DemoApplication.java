package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	Factory f = new Factory();
	Car personal = f.createPersonal("vert",2022);
	Car cargo = f.createCargo("bleu",2002);



}

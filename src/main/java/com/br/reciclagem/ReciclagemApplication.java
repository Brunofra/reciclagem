package com.br.reciclagem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication

@EnableMongoRepositories("com.br.reciclagem.repository.mongo")
public class ReciclagemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReciclagemApplication.class, args);
	}

}

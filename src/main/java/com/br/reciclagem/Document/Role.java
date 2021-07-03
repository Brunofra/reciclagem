package com.br.reciclagem.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
public @Data class Role {

	@Id
	private String id;
	
	private String name;
}

package com.br.reciclagem.Document;

import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
public @Data class User {

	
	@Id
	private String id;
	
	private String name;
	
	private String email;
	
	private Set<Role> perfis;

	public User() {
		super();
	}

	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	
}

package com.br.reciclagem.Entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Entity
public @Data class User {

	
	
	
	public User() {
		super();
	}
	
	

	public User( String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private String email;
	
	@ManyToMany
	private Set<Role> perfis;
	
	
}

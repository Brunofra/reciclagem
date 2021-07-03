package com.br.reciclagem.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.br.reciclagem.Document.User;
public interface UserRepositoryMongo extends MongoRepository<User, String>{


	  User save(User user);

	  User findByName(String name);
		
	  
	
	  
	  User  findByEmail(String email);
	  
	  User findByNameIgnoreCase(String name);
	
}

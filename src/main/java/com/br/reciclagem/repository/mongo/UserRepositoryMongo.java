package com.br.reciclagem.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.br.reciclagem.Document.User;
public interface UserRepositoryMongo extends MongoRepository<User, String>{


	  User save(User user);

	  User findByName(String name);
	  
	  User  findByEmail(String email);
	  
	  User findByNameIgnoreCaseLike(String name);
	
	  @Query("{'email' : ?0}")
	  User findByEmailqualquercoisa(String email);
}

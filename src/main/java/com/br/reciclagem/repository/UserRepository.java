package com.br.reciclagem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.br.reciclagem.Entity.User;


public interface UserRepository extends JpaRepository<User, Long>{

  User save(User user);

  User findByName(String name);
	
  
  @Query("select u from User u where u.name = ?1")
  
  User findByQuery(String name);
  
  User  findByEmail(String email);
  
  User findByNameIgnoreCase(String name);
  
}

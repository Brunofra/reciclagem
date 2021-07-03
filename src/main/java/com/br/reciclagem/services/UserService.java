package com.br.reciclagem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.reciclagem.Document.User;
import com.br.reciclagem.repository.mongo.UserRepositoryMongo;

@Service
public class UserService {
	@Autowired
	UserRepositoryMongo userrepository;
	
	public List<User> findall() {
		return userrepository.findAll();
	}
}

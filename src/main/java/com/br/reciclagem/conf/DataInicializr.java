package com.br.reciclagem.conf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.br.reciclagem.Document.User;
import com.br.reciclagem.repository.mongo.UserRepositoryMongo;

@Component
public class DataInicializr implements ApplicationListener<ContextRefreshedEvent>{
//	@Autowired
//	UserRepository userRepository;
	
	@Autowired
	UserRepositoryMongo UserRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event){
		// mongodb
		try {
			
			List<User> users = UserRepository.findAll();
			
			if(users.isEmpty()) {
			
				createusers("bruno", "brunoalvesfra@gmail.com");
				createusers("joao", "joao@gmail.com");
				createusers("maria", "maria@gmail.com");
			}
			
			//User user = userRepository.getOne(2L);
			
			User user = UserRepository.findByName("maria");
			System.out.println(user.getName());
			
		} catch (Exception e) {

		}
		
		/*
		 * mysql
		 * 	try {
				
				List<User> users = userRepository.findAll();
				
				if(users.isEmpty()) {
				
					createusers("bruno", "brunoalvesfra@gmail.com");
					createusers("joao", "joao@gmail.com");
					createusers("maria", "maria@gmail.com");
				}
				
				//User user = userRepository.getOne(2L);
				
				User user = userRepository.findByName("maria");
				System.out.println(user.getName());
				
				user = userRepository.findByQuery("bruno");

				System.out.println(user.getName());
				

				user = userRepository.findByNameIgnoreCase("bruno");

				System.out.println(user.getName());
				
			} catch (Exception e) {

			}*/
	}
	
	
	public void createusers(String nome, String email) {
		
			User user = new User(nome, email);
			
			UserRepository.save(user);
	}

}

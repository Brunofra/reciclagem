package com.br.reciclagem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.br.reciclagem.repository.mongo.UserRepositoryMongo;
import com.br.reciclagem.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/users")
	public String getUser(Model model) {
		model.addAttribute("usersList",userService.findall());
		
		return "user";
	}
}

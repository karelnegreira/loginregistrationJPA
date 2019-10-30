package com.loginregistrationjpa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.loginregistrationjpa.model.Usuarios;
import com.loginregistrationjpa.repos.Repository;

@Controller
public class WebController {
@Autowired
Repository repository;
@RequestMapping("/search/{id}")
@ResponseBody
public Optional<Usuarios> getUserById(@PathVariable("id") int id) {
	Optional<Usuarios> usuarios = (Optional<Usuarios>) repository.findById(id);
	return usuarios;
}

@PostMapping("/add")
public Usuarios save(@PathVariable("t1")String username, @PathVariable("t2")String pass) {
	System.out.println(username + pass);
Usuarios usuarios = new Usuarios(username, pass);	
  repository.save(usuarios);
  return usuarios;
}

}

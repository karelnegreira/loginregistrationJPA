package com.loginregistrationjpa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

@GetMapping("/add")
public Usuarios save(@RequestParam("username") String username, @RequestParam("pass") String pass) {
	
Usuarios usuarios = new Usuarios(username,pass);	
System.out.println(usuarios.getUsername());
  repository.save(usuarios);
  return usuarios;
}

}

package com.loginregistrationjpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuarios {
	@Id
	@GeneratedValue
private int id;
	
private String username;
private String pass;

public Usuarios(String username, String password) {
    this.pass = password;
	this.username = username;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
@Override
public String toString() {
	return "Usuarios [id=" + id + ", username=" + username + ", pass=" + pass + "]";
}



}

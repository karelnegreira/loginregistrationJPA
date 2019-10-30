package com.loginregistrationjpa.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loginregistrationjpa.model.Usuarios;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Usuarios, Integer> {
//List<Usuarios>findByIdandUsernameList(Usuarios usuarios);
}

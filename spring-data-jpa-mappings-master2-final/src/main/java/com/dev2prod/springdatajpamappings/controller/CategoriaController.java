package com.dev2prod.springdatajpamappings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev2prod.springdatajpamappings.Interface.CategoriaInterface;
import com.dev2prod.springdatajpamappings.Interface.PersonaInterface;
import com.dev2prod.springdatajpamappings.entity.Categoria;
import com.dev2prod.springdatajpamappings.entity.Persona;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class CategoriaController {

	
	
	@Autowired
	private CategoriaInterface cateIn;
	
	@GetMapping("/Categoria")
	public List<Categoria> listarTodosUsuario() {
		return cateIn.findAll();
	}
}

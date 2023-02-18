package com.dev2prod.springdatajpamappings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev2prod.springdatajpamappings.Interface.ArticuloInterface;
import com.dev2prod.springdatajpamappings.Interface.CategoriaInterface;
import com.dev2prod.springdatajpamappings.entity.Articulo;
import com.dev2prod.springdatajpamappings.entity.Categoria;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/")
public class ArticuloController {

	
	@Autowired
	private ArticuloInterface articuloInterface;
	
	@GetMapping("/Articulo")
	public List<Articulo> listarTodosUsuario() {
		return articuloInterface.findAll();
	}
}

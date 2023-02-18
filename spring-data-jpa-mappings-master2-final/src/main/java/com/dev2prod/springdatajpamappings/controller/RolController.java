package com.dev2prod.springdatajpamappings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev2prod.springdatajpamappings.Interface.DetalleVentaInterface;
import com.dev2prod.springdatajpamappings.Interface.RolInterface;
import com.dev2prod.springdatajpamappings.entity.DetalleVenta;
import com.dev2prod.springdatajpamappings.entity.Rol;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class RolController {

	
	@Autowired
	private RolInterface rolInterface;
	
	@GetMapping("/Rol")
	public List<Rol> listarTodosUsuario() {
		return rolInterface.findAll();
	}
}

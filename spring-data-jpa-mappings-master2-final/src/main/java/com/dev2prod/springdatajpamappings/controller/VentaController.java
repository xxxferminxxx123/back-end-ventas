package com.dev2prod.springdatajpamappings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev2prod.springdatajpamappings.Interface.UsuarioInterface;
import com.dev2prod.springdatajpamappings.Interface.VentaInterface;
import com.dev2prod.springdatajpamappings.entity.Usuario;
import com.dev2prod.springdatajpamappings.entity.Venta;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class VentaController {
	@Autowired
	private VentaInterface ventas;
	
	@GetMapping("/Venta")
	public List<Venta> listarTodosVentas() {
		return ventas.findAll();
	}


}

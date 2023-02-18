package com.dev2prod.springdatajpamappings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev2prod.springdatajpamappings.Interface.DetalleVentaInterface;
import com.dev2prod.springdatajpamappings.Interface.IngresoInterface;
import com.dev2prod.springdatajpamappings.entity.DetalleVenta;
import com.dev2prod.springdatajpamappings.entity.Ingreso;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class IngresoController {
	@Autowired
	private IngresoInterface ingresoInterface;
	
	@GetMapping("/Ingreso")
	public List<Ingreso> listarTodosUsuario() {
		return ingresoInterface.findAll();
	}
}

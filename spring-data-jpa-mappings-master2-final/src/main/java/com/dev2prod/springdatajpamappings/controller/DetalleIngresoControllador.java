package com.dev2prod.springdatajpamappings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev2prod.springdatajpamappings.Interface.DetalleIngresoInterface;
import com.dev2prod.springdatajpamappings.entity.DetalleIngreso;
import com.dev2prod.springdatajpamappings.entity.Usuario;


@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class DetalleIngresoControllador {

	@Autowired
	private DetalleIngresoInterface detalleIngresoInterface;
	
	@GetMapping("/DetalleIngreso")
	public List<DetalleIngreso> listarDetalleControlador() {
		return detalleIngresoInterface.findAll();
	}
}

package com.dev2prod.springdatajpamappings.controller;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import com.dev2prod.springdatajpamappings.Interface.UsuarioInterface;
import com.dev2prod.springdatajpamappings.entity.Rol;
import com.dev2prod.springdatajpamappings.entity.Usuario;


@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {
	@Autowired
	private UsuarioInterface usuarioInterface;
	
	
	
	@GetMapping("/Usuario")
	public List<Usuario> listarTodosUsuario() {
		return usuarioInterface.findAll();
	}
	
	 @GetMapping("/Usuario/{nombre}")
	    public ResponseEntity<List<Usuario>> getUsersByFirstname(@PathVariable String nombre) {
		List<Usuario> usuarios =  usuarioInterface.findByFirstnameEndsWith(nombre);
		return ResponseEntity.ok(usuarios);		
	}
	 
	    @GetMapping("/Usuario/v1/{nombre}")
	    public List<Object[]> findByFirstnameEndsWiths(@PathVariable String nombre) {
	    	List<Object[]> rolesCount = usuarioInterface.findByFirstnameEndsWiths(nombre);
	        return rolesCount;	
	    }
	    
	    @GetMapping("/Usuario/v2/{nombre}")
	    public List<Map<String, Object>> getUsuarioRoles(@PathVariable String nombre) {
	        List<Object[]> results = usuarioInterface.findByFirstnameEndsWiths(nombre);
	        List<Map<String, Object>> usuarioRoles = new ArrayList();
	        for (Object[] row : results) {
	            Map<String, Object> map = new HashMap();
	            map.put("id_usuario", row[0]);
	            map.put("id_rol", row[1]);
	            usuarioRoles.add(map);
	        }
	        return usuarioRoles;
	    }
	    
	    @GetMapping("/Usuario/v3/{nombre}")
	    public List<Map<String, Object>> countByRol(@PathVariable String nombre) {
	        List<Object[]> results = usuarioInterface.countByRol(nombre);
	        
	        List<Map<String, Object>> usuariCount = new ArrayList();
	        for (Object[] row : results) {
	            Map<String, Object> map = new HashMap();
	            map.put("id_rol", row[0]);
	            map.put("repetidos", row[1]);
	            usuariCount.add(map);
	        }
	        return usuariCount;
	    }






	
}
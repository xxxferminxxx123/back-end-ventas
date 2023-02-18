package com.dev2prod.springdatajpamappings.Interface;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dev2prod.springdatajpamappings.entity.Usuario;

@Repository
public interface UsuarioInterface extends JpaRepository<Usuario, Long>{

	
	//  @Query(value = "SELECT u.id_usuario, u.nombre, r.nombre AS rol_nombre"
	// 	  		+ " FROM usuario u JOIN rol r ON u.id_rol = r.id", nativeQuery = true)
	//public  List<Object[]> buscarUsuariosConRol();
	  

	  
	  //@Query("select u from Usuario u where u.nombre like %?1")
	  @Query(value = "SELECT *"
	 	  		+ " FROM usuario u JOIN rol r ON u.id_rol = r.id_rol where u.nombre like %?1", nativeQuery = true)
	  public List<Usuario> findByFirstnameEndsWith(String nombre);
	  
	  @Query(value = "SELECT u.id_usuario,u.id_rol"
	 	  		+ " FROM usuario u JOIN rol r ON u.id_rol = r.id_rol"
	 	  		+ " where u.nombre like %?1", nativeQuery = true)
	    public List<Object[]> findByFirstnameEndsWiths(String nombre);
	    
	  
	   @Query(value = "SELECT u.id_rol, COUNT(u.id_rol) AS count "
	            + "FROM usuario u JOIN rol r ON u.id_rol = r.id_rol "
	            + "WHERE u.nombre LIKE %?1 "
	            + "GROUP BY u.id_rol", nativeQuery = true)
	    public List<Object[]> countByRol(String nombre);

}

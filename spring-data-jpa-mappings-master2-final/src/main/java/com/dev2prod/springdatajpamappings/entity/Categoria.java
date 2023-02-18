package com.dev2prod.springdatajpamappings.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Categoria")
	private Long idCategoria;
    private String nombre;
    private String descripcion;
    private Boolean estado;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Categoria",referencedColumnName = "id_Categoria")
    private List<Articulo> articulos;

    
	public Long getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
    
    
    
}

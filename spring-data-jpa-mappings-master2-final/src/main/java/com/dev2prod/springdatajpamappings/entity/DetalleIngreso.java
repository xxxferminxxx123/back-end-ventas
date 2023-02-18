package com.dev2prod.springdatajpamappings.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "detalleIngreso")
public class DetalleIngreso {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idDetalleIngreso")
	private Long idDetalleIngreso;
	private Long cantidad;
	private Double precio;
	
    //FOREIGN KEY (idingreso) REFERENCES ingreso (idingreso) ON DELETE CASCADE,
    //FOREIGN KEY (idarticulo) REFERENCES articulo (idarticulo)
	
	
	//------INGRESO 
    @ManyToOne
    @JoinColumn(name = "idIngreso")
    private Ingreso ingreso;
	//------INGRESO 

	//------ARTICULO 

    @ManyToOne
    @JoinColumn(name = "idarticulo")
    private Articulo articulo;
	//------ARTICULO 

	public Long getIdDetalleIngreso() {
		return idDetalleIngreso;
	}

	public void setIdDetalleIngreso(Long idDetalleIngreso) {
		this.idDetalleIngreso = idDetalleIngreso;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Ingreso getIngreso() {
		return ingreso;
	}

	public void setIngreso(Ingreso ingreso) {
		this.ingreso = ingreso;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
    
    
	
}

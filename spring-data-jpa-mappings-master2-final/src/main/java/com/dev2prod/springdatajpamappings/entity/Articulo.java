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
@Table(name="articulo")
public class Articulo {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idarticulo")
	private Long idarticulo;
    

    
	private String codigo;
	private String nombre;
	private Long stock;
	private Double precioVenta;
	private String descripcion;
	private String estado;
	

	//DETALLE VENTA
	
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idarticulo",referencedColumnName = "idarticulo")
    private List<DetalleVenta> detalleVentas;
   
	//DETALLE VENTA
    
    //CATEGORIA
    @ManyToOne
    @JoinColumn(name = "id_Categoria")
    private Categoria categoria;
    //CATEGORIA
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idarticulo",referencedColumnName = "idarticulo")
    private List<DetalleIngreso> detalleIngresos;

	public Long getIdarticulo() {
		return idarticulo;
	}
	public void setIdarticulo(Long idarticulo) {
		this.idarticulo = idarticulo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getStock() {
		return stock;
	}
	public void setStock(Long stock) {
		this.stock = stock;
	}
	public Double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	

	
}

package com.dev2prod.springdatajpamappings.entity;


import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.transaction.Transactional;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
	private Long id_venta;

	private String tipo_comprobante ;
	private String serie_comprobante  ;
	private String  num_comprobante ;
	private Date fecha_hora ;
	private Double impuesto  ;
	private Double total  ;
	private String  estado ;
    //FOREIGN KEY (idcliente) REFERENCES persona (idpersona),
    //FOREIGN KEY (idusuario) REFERENCES usuario (idusuario)
    
    @ManyToOne
    @JoinColumn(name = "idPersona")
    private Persona persona;
    
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
    
    
	//DETALLE VENTA
	
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_venta",referencedColumnName = "id_venta")
    private List<DetalleVenta> detalleVentas;
   
	//DETALLE VENTA

	

	public String getTipo_comprobante() {
		return tipo_comprobante;
	}

	public Long getId_venta() {
		return id_venta;
	}

	public void setId_venta(Long id_venta) {
		this.id_venta = id_venta;
	}

	public void setTipo_comprobante(String tipo_comprobante) {
		this.tipo_comprobante = tipo_comprobante;
	}

	public String getSerie_comprobante() {
		return serie_comprobante;
	}

	public void setSerie_comprobante(String serie_comprobante) {
		this.serie_comprobante = serie_comprobante;
	}

	public String getNum_comprobante() {
		return num_comprobante;
	}

	public void setNum_comprobante(String num_comprobante) {
		this.num_comprobante = num_comprobante;
	}

	public Date getFecha_hora() {
		return fecha_hora;
	}

	public void setFecha_hora(Date fecha_hora) {
		this.fecha_hora = fecha_hora;
	}

	public Double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(Double impuesto) {
		this.impuesto = impuesto;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
    
    
    
}

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
@Table(name = "ingreso")
public class Ingreso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idIngreso")
    private Long idIngreso;
    private String tipo_comprobante;
    private String serie_comprobante;
    private String num_comprobante;
    private Date fecha;
    private Double impuesto;
    private Double total;
    private String estado;
    
    
    //-----------------INGRESO------------
    @ManyToOne
    @JoinColumn(name = "idPersona")
    private Persona persona;
    
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
    //-----------------INGRESO------------
    
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idIngreso",referencedColumnName = "idIngreso")
    private List<DetalleIngreso> detalleIngresos;

    

    


	public Long getIdIngreso() {
		return idIngreso;
	}

	public void setIdIngreso(Long idIngreso) {
		this.idIngreso = idIngreso;
	}

	public String getTipo_comprobante() {
		return tipo_comprobante;
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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
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

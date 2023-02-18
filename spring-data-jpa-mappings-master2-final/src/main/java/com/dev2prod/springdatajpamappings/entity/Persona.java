package com.dev2prod.springdatajpamappings.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.transaction.Transactional;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name="persona")
public class Persona {
	
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPersona")
    private Long idPersona;
    
	private String tipoPersona;
	private String tipoDocumento;
	private String nombre;
	private String direccion;
	private String telefono;
	private String email;
	private String num_documento;
	
	
	///--------------VENTAS-----------------------
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPersona",referencedColumnName = "idPersona")
    private List<Venta> ventas;
	///--------------VENTAS-----------------------
    
    
	///--------------Ingreso-----------------------
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPersona",referencedColumnName = "idPersona")
    private List<Ingreso> ingresos;
	///--------------Ingreso-----------------------


	public Long getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}
	public String getTipoPersona() {
		return tipoPersona;
	}
	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNum_documento() {
		return num_documento;
	}
	public void setNum_documento(String num_documento) {
		this.num_documento = num_documento;
	}
	
}

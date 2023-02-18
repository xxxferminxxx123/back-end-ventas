package com.dev2prod.springdatajpamappings.entity;


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
@Table(name="usuario")
public class Usuario {
	    @Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "idUsuario")
		private Long idUsuario;
	    
	

		private String nombre ;
		private String  tipo_documento ;
		private String num_documento ;
		private String direccion ;
		private String telefono ;
		private String email ;
		private String password;
		private Boolean estado ;
		 
	    @ManyToOne
	    @JoinColumn(name = "idRol")
	    private Rol rol;
	    
	    
		///--------------VENTAS-----------------------
	    @OneToMany(cascade = CascadeType.ALL)
	    @JoinColumn(name = "idUsuario",referencedColumnName = "idUsuario")
	    private List<Venta> ventas;
		///--------------VENTAS-----------------------
	    
	    
		///--------------INGRESO-----------------------
	    @OneToMany(cascade = CascadeType.ALL)
	    @JoinColumn(name = "idUsuario",referencedColumnName = "idUsuario")
	    private List<Ingreso> ingresos;
		///--------------INGRESO-----------------------
	    
	    
	    
	    
	    

		public Long getIdUsuario() {
			return idUsuario;
		}

		public void setIdUsuario(Long idUsuario) {
			this.idUsuario = idUsuario;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getTipo_documento() {
			return tipo_documento;
		}

		public void setTipo_documento(String tipo_documento) {
			this.tipo_documento = tipo_documento;
		}

		public String getNum_documento() {
			return num_documento;
		}

		public void setNum_documento(String num_documento) {
			this.num_documento = num_documento;
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

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Boolean getEstado() {
			return estado;
		}

		public void setEstado(Boolean estado) {
			this.estado = estado;
		}

		public Rol getRol() {
			return rol;
		}

		public void setRol(Rol rol) {
			this.rol = rol;
		}



	    
	    
}

package com.juanseb.gs.cuidadofamiliar.model.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "PermisoLaboral")
public class PermisoLaboral implements Serializable {

	private static final long serialVersionUID = 2360278092334480419L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Date fechaDeInicioDelPermiso;
	private Date fechaDeFinDelPermiso;
	private String descripcion;
	private String estado;

	@ManyToOne
	@JoinColumn(name = "usuarioId")
	private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaDeInicioDelPermiso() {
		return fechaDeInicioDelPermiso;
	}

	public void setFechaDeInicioDelPermiso(Date fechaDeInicioDelPermiso) {
		this.fechaDeInicioDelPermiso = fechaDeInicioDelPermiso;
	}

	public Date getFechaDeFinDelPermiso() {
		return fechaDeFinDelPermiso;
	}

	public void setFechaDeFinDelPermiso(Date fechaDeFinDelPermiso) {
		this.fechaDeFinDelPermiso = fechaDeFinDelPermiso;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	// Getters y setters
}

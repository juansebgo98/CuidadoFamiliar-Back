package com.juanseb.gs.cuidadofamiliar.model.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "informe_medico")
public class InformeMedico implements Serializable {

	private static final long serialVersionUID = 4750035226229371197L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Date fechaDelInforme;
	private String descripcion;

	@ManyToOne
	@JoinColumn(name = "citamedicaId")
	private Citamedica citamedica;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaDelInforme() {
		return fechaDelInforme;
	}

	public void setFechaDelInforme(Date fechaDelInforme) {
		this.fechaDelInforme = fechaDelInforme;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Citamedica getCitaMedica() {
		return citamedica;
	}

	public void setCitaMedica(Citamedica citaMedica) {
		this.citamedica = citaMedica;
	}

	// Getters y setters
}

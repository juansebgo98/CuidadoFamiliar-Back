package com.juanseb.gs.cuidadofamiliar.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "cita_medica")
public class Citamedica implements Serializable {

    private static final long serialVersionUID = -442413214300424185L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date fechaYHora;

    @Column(name = "descripcion")
    private String descripcion;

    private String lugar;

    @Column(name = "tipoDeCita")
    private String tipoDeCita;

    @ManyToOne
    @JoinColumn(name = "personaMayorID")
    private PersonaMayor personaMayor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaYHora() {
		return fechaYHora;
	}

	public void setFechaYHora(Date fechaYHora) {
		this.fechaYHora = fechaYHora;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getTipoDeCita() {
		return tipoDeCita;
	}

	public void setTipoDeCita(String tipoDeCita) {
		this.tipoDeCita = tipoDeCita;
	}

	public PersonaMayor getPersonaMayor() {
		return personaMayor;
	}

	public void setPersonaMayor(PersonaMayor personaMayor) {
		this.personaMayor = personaMayor;
	}

	// Getters y setters
}

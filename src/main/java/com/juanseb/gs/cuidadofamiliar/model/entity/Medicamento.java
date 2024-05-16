package com.juanseb.gs.cuidadofamiliar.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "medicamento")
public class Medicamento implements Serializable {

	private static final long serialVersionUID = -571649381714598509L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;
	private int cantidadActual;
	private int cantidadMinimaRequerida;
	private int cantidadDePastillasPorDia;
	private String frecuenciaDeDosificacion;

	@ManyToOne
	@JoinColumn(name = "PersonaMayorID")
	private PersonaMayor personaMayor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	public int getCantidadMinimaRequerida() {
		return cantidadMinimaRequerida;
	}

	public void setCantidadMinimaRequerida(int cantidadMinimaRequerida) {
		this.cantidadMinimaRequerida = cantidadMinimaRequerida;
	}

	public int getCantidadDePastillasPorDia() {
		return cantidadDePastillasPorDia;
	}

	public void setCantidadDePastillasPorDia(int cantidadDePastillasPorDia) {
		this.cantidadDePastillasPorDia = cantidadDePastillasPorDia;
	}

	public String getFrecuenciaDeDosificacion() {
		return frecuenciaDeDosificacion;
	}

	public void setFrecuenciaDeDosificacion(String frecuenciaDeDosificacion) {
		this.frecuenciaDeDosificacion = frecuenciaDeDosificacion;
	}

	public PersonaMayor getPersonaMayor() {
		return personaMayor;
	}

	public void setPersonaMayor(PersonaMayor personaMayor) {
		this.personaMayor = personaMayor;
	}

}

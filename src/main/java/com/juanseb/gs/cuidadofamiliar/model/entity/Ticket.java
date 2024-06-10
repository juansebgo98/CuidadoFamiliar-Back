package com.juanseb.gs.cuidadofamiliar.model.entity;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket implements Serializable {

	private static final long serialVersionUID = 9026943296708174703L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Date fechaDeCompra;

	@ManyToOne
	@JoinColumn(name = "citaMedicaId")
	private CitaMedica citaMedica;

	@ManyToOne
	@JoinColumn(name = "personaMayorId")
	private PersonaMayor personaMayor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaDeCompra() {
		return fechaDeCompra;
	}

	public void setFechaDeCompra(Date fechaDeCompra) {
		this.fechaDeCompra = fechaDeCompra;
	}

	public CitaMedica getCitaMedica() {
		return citaMedica;
	}

	public void setCitaMedica(CitaMedica citaMedica) {
		this.citaMedica = citaMedica;
	}

	public PersonaMayor getPersonaMayor() {
		return personaMayor;
	}

	public void setPersonaMayor(PersonaMayor personaMayor) {
		this.personaMayor = personaMayor;
	}

	// Getters y setters
}

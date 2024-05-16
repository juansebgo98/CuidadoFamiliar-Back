package com.juanseb.gs.cuidadofamiliar.model.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "comentario")
public class Comentario implements Serializable {

	private static final long serialVersionUID = -8935689933697480849L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String contenido;
	private Date fechaYHoraDelComentario;

	@ManyToOne
	@JoinColumn(name = "usuarioId")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "personaMayorId")
	private PersonaMayor personaMayor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Date getFechaYHoraDelComentario() {
		return fechaYHoraDelComentario;
	}

	public void setFechaYHoraDelComentario(Date fechaYHoraDelComentario) {
		this.fechaYHoraDelComentario = fechaYHoraDelComentario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public PersonaMayor getPersonaMayor() {
		return personaMayor;
	}

	public void setPersonaMayor(PersonaMayor personaMayor) {
		this.personaMayor = personaMayor;
	}

	// Getters y setters
}

package com.juanseb.gs.cuidadofamiliar.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "usuario_persona_mayor")
public class UsuarioPersonaMayor implements Serializable {

	private static final long serialVersionUID = -3492149450442791603L;

	@EmbeddedId
	private UsuarioPersonaMayorId id;

	private String rol;

	@Embeddable
	public static class UsuarioPersonaMayorId implements Serializable {

		private static final long serialVersionUID = 1924035632376688156L;
		private Long usuarioId;
		private Long personaMayorId;

		public Long getUsuarioId() {
			return usuarioId;
		}

		public void setUsuarioId(Long usuarioId) {
			this.usuarioId = usuarioId;
		}

		public Long getPersonaMayorId() {
			return personaMayorId;
		}

		public void setPersonaMayorId(Long personaMayorId) {
			this.personaMayorId = personaMayorId;
		}

	}

	public UsuarioPersonaMayorId getId() {
		return id;
	}

	public void setId(UsuarioPersonaMayorId id) {
		this.id = id;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
}

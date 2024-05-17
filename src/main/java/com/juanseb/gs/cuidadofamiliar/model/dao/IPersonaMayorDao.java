package com.juanseb.gs.cuidadofamiliar.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.juanseb.gs.cuidadofamiliar.model.entity.PersonaMayor;

public interface IPersonaMayorDao extends JpaRepository<PersonaMayor, Long> {

	// Implementacion de query para base de datos
	@Query("SELECT p FROM PersonaMayor p INNER JOIN UsuarioPersonaMayor up ON up.id.personaMayorId = p.id WHERE up.id.usuarioId = :usuarioId")
	public List<PersonaMayor> obtenerPersonaMayorUsuario(@Param("usuarioId") Long usuarioId);
	
	@Query("SELECT p FROM PersonaMayor p INNER JOIN CitaMedica c ON c.personaMayor.id = p.id WHERE c.id = :citaId")
	public PersonaMayor obtenerPersonaMayorCita(@Param("citaId") Long citaId);
	
}
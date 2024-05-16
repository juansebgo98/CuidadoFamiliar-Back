package com.juanseb.gs.cuidadofamiliar.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.juanseb.gs.cuidadofamiliar.model.entity.Comentario;

public interface IComentarioDao extends JpaRepository<Comentario, Long> {

	// Implementacion de query para base de datos
	@Query("SELECT c FROM Comentario c INNER JOIN PersonaMayor p ON p.id = c.personaMayor.id WHERE c.personaMayor.id = :personaMayorId")
	public List<Comentario> obtenerComentariosPersonaMayor(@Param("personaMayorId") Long personaMayorId);

}

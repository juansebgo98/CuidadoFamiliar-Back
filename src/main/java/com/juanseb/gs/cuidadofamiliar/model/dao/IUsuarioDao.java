package com.juanseb.gs.cuidadofamiliar.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.juanseb.gs.cuidadofamiliar.model.entity.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Long> {

	// Implementacion de query para base de datos
	//TODO
	@Query("SELECT u FROM Usuario u INNER JOIN UsuarioPersonaMayor up ON up.id.usuarioId = u.id WHERE u.id = :personaMayorId")
	public List<Usuario> obtenerUsuarioPersonaMayor(@Param("personaMayorId") Long personaMayorId);
}

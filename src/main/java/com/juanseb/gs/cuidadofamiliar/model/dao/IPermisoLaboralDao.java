package com.juanseb.gs.cuidadofamiliar.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.juanseb.gs.cuidadofamiliar.model.entity.PermisoLaboral;

public interface IPermisoLaboralDao extends JpaRepository<PermisoLaboral, Long> {

	// Implementacion de query para base de datos
	@Query("SELECT p FROM PermisoLaboral p INNER JOIN Usuario u ON u.id = p.usuario.id WHERE u.id = :usuarioId")
	public List<PermisoLaboral> obtenerMedicamentoUsuario(@Param("usuarioId") Long usuarioId);

}

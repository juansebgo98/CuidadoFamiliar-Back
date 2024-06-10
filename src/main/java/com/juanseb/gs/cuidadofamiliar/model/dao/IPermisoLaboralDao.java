package com.juanseb.gs.cuidadofamiliar.model.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.juanseb.gs.cuidadofamiliar.model.entity.PermisoLaboral;

public interface IPermisoLaboralDao extends JpaRepository<PermisoLaboral, Long> {

	// Implementacion de query para base de datos
	@Query("SELECT pl from PermisoLaboral pl WHERE pl.fechaDeInicioDelPermiso < :fecha")
	public List<PermisoLaboral> obtenerPermisoLaboralAnteriorFecha(@Param("fecha")Date fecha);
	
	@Query("SELECT pl from PermisoLaboral pl WHERE pl.fechaDeInicioDelPermiso = :fecha")
	public PermisoLaboral obtenerPermisoFecha(@Param("fecha") Date fecha);


}

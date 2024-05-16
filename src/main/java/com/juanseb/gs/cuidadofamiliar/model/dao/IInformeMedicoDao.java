package com.juanseb.gs.cuidadofamiliar.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.juanseb.gs.cuidadofamiliar.model.entity.InformeMedico;

public interface IInformeMedicoDao extends JpaRepository<InformeMedico, Long> {

	// Implementacion de query para base de datos
	@Query("SELECT i FROM InformeMedico i INNER JOIN CitaMedica c ON c.id = i.citamedica.id INNER JOIN PersonaMayor p ON p.id = c.personaMayor.id WHERE c.personaMayor.id = :personaMayorId")
	public List<InformeMedico> obtenerInformeMedicoPersonaMayor(@Param("personaMayorId") Long personaMayorId);

}

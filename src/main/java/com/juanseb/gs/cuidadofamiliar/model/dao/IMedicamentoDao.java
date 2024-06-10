package com.juanseb.gs.cuidadofamiliar.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.juanseb.gs.cuidadofamiliar.model.entity.Medicamento;

public interface IMedicamentoDao extends JpaRepository<Medicamento, Long> {

	// Implementacion de query para base de datos
	@Query("SELECT m FROM Medicamento m INNER JOIN PersonaMayor p ON p.id = m.personaMayor.id WHERE p.personaMayor.id = :personaMayorId")
	public List<Medicamento> obtenerMedicamentoPersonaMayor(@Param("personaMayorId") Long personaMayorId);

}

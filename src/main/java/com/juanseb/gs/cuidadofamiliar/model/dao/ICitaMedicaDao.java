package com.juanseb.gs.cuidadofamiliar.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.juanseb.gs.cuidadofamiliar.model.entity.CitaMedica;

public interface ICitaMedicaDao extends JpaRepository<CitaMedica, Long> {

	// Implementacion de query para base de datos

}

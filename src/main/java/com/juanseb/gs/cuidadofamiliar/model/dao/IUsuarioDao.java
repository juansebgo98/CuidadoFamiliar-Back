package com.juanseb.gs.cuidadofamiliar.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.juanseb.gs.cuidadofamiliar.model.entity.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Long> {
	
	//Implementacion de query para base de datos

}

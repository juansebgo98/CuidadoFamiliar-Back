package com.juanseb.gs.cuidadofamiliar.model.service.inter;

import java.sql.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.juanseb.gs.cuidadofamiliar.model.entity.PermisoLaboral;
import com.juanseb.gs.cuidadofamiliar.model.entity.Ticket;

public interface IPermisoLaboralService {

	//DAO basicas
	public List<PermisoLaboral> findAll();

	public Page<PermisoLaboral> findAll(Pageable pageable);

	public PermisoLaboral findById(Long id);
	
	public PermisoLaboral saveUpdate(PermisoLaboral PermisoLaboral);

	public void delete(Long id);
	

	//DAO implementadas.
	public List<PermisoLaboral> obtenerPermisoLaboralAnteriorFecha(Date fecha);
	
	public PermisoLaboral obtenerPermisoFecha(Date fecha);
	
	
}

package com.juanseb.gs.cuidadofamiliar.model.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import com.juanseb.gs.cuidadofamiliar.model.dao.IPermisoLaboralDao;
import com.juanseb.gs.cuidadofamiliar.model.entity.PermisoLaboral;
import com.juanseb.gs.cuidadofamiliar.model.entity.Ticket;
import com.juanseb.gs.cuidadofamiliar.model.service.inter.IPermisoLaboralService;

public class PermisoLaboralServiceImpl implements IPermisoLaboralService {

	private IPermisoLaboralDao PermisoLaboralDao;
	@Override
	@Transactional(readOnly = true)
	public List<PermisoLaboral> findAll() {
		return PermisoLaboralDao.findAll();
		 
	}

	@Override
	@Transactional(readOnly = true)
	public Page<PermisoLaboral> findAll(Pageable pageable) {
		
		return PermisoLaboralDao.findAll(pageable);
	}

	@Override
	public PermisoLaboral findById(Long id) {
		return PermisoLaboralDao.findById(id).orElse(null);
	}

	@Override
	public PermisoLaboral saveUpdate(PermisoLaboral PermisoLaboral) {
		// TODO Auto-generated method stub
		return PermisoLaboralDao.save(PermisoLaboral);
	}

	@Override
	public void delete(Long id) {
		PermisoLaboralDao.deleteById(id);
	}

	
	@Override
	@Transactional(readOnly = true)
	public List<PermisoLaboral> obtenerPermisoLaboralAnteriorFecha(Date fecha) {

		return PermisoLaboralDao.obtenerPermisoLaboralAnteriorFecha(fecha);
	}

	@Override
	@Transactional(readOnly = true)
	public PermisoLaboral obtenerPermisoFecha(Date fecha) {
		// TODO Auto-generated method stub
		return PermisoLaboralDao.obtenerPermisoFecha(fecha);
	}

}

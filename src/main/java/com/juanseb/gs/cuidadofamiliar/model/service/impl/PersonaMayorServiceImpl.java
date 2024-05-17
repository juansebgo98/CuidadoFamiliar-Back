package com.juanseb.gs.cuidadofamiliar.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.juanseb.gs.cuidadofamiliar.model.dao.IPersonaMayorDao;
import com.juanseb.gs.cuidadofamiliar.model.entity.PersonaMayor;
import com.juanseb.gs.cuidadofamiliar.model.service.inter.IPersonaMayorService;

@Service
public class PersonaMayorServiceImpl implements IPersonaMayorService {

	@Autowired
	private IPersonaMayorDao personaMayorDao;

	@Override
	@Transactional(readOnly = true)
	public List<PersonaMayor> findAll() {
		return (List<PersonaMayor>) personaMayorDao.findAll();
	}
	
	@Override
	@Transactional
	public List<PersonaMayor> obtenerPersonaMayorDeUsuario(Long usuarioId) {
		return personaMayorDao.obtenerPersonaMayorUsuario(usuarioId);
	}

	@Override
	@Transactional
	public PersonaMayor obtenerPersonaMayorDeCitaMedica(Long citaMedicaId) {
		return personaMayorDao.obtenerPersonaMayorCita(citaMedicaId);
	}

	@Override
	@Transactional(readOnly = true)
	public Page<PersonaMayor> findAll(Pageable pageable) {
		return personaMayorDao.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public PersonaMayor findById(Long id) {
		return personaMayorDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public PersonaMayor saveUpdate(PersonaMayor usuario) {
		return personaMayorDao.save(usuario);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		personaMayorDao.deleteById(id);

	}

	

}

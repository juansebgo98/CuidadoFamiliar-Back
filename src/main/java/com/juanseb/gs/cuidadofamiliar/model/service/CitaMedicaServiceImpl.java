package com.juanseb.gs.cuidadofamiliar.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.juanseb.gs.cuidadofamiliar.model.dao.ICitaMedicaDao;
import com.juanseb.gs.cuidadofamiliar.model.entity.CitaMedica;

import org.springframework.transaction.annotation.Transactional;

@Service
public class CitaMedicaServiceImpl implements ICitaMedica {

	@Autowired
	private ICitaMedicaDao citaMedicaDao;

	@Override
	@Transactional(readOnly = true)
	public List<CitaMedica> findAll() {
		return (List<CitaMedica>) citaMedicaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<CitaMedica> findAll(Pageable pageable) {
		return citaMedicaDao.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public CitaMedica findById(Long id) {
		return citaMedicaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public CitaMedica saveUpdate(CitaMedica usuario) {
		return citaMedicaDao.save(usuario);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		citaMedicaDao.deleteById(id);

	}

}

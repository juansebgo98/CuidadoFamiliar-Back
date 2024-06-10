package com.juanseb.gs.cuidadofamiliar.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.juanseb.gs.cuidadofamiliar.model.dao.IMedicamentoDao;
import com.juanseb.gs.cuidadofamiliar.model.entity.Medicamento;
import com.juanseb.gs.cuidadofamiliar.model.service.inter.IMedicamentoService;

@Service
public class MedicamentoServiceImpl implements IMedicamentoService {

	@Autowired
	private IMedicamentoDao medicamentoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Medicamento> findAll() {
		return (List<Medicamento>) medicamentoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Medicamento> findAll(Pageable pageable) {
		return medicamentoDao.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Medicamento findById(Long id) {
		return medicamentoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Medicamento saveUpdate(Medicamento medicamento) {
		return medicamentoDao.save(medicamento);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		medicamentoDao.deleteById(id);

	}

	@Override
	public List<Medicamento> findByPersonaMayor(Long idPersonaMayor) {
		return medicamentoDao.obtenerMedicamentoPersonaMayor(idPersonaMayor);
	}

}

package com.juanseb.gs.cuidadofamiliar.model.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import com.juanseb.gs.cuidadofamiliar.model.dao.IInformeMedicoDao;
import com.juanseb.gs.cuidadofamiliar.model.entity.InformeMedico;
import com.juanseb.gs.cuidadofamiliar.model.service.inter.IInformeMedicoService;

public class InformeMedicoServiceImpl implements IInformeMedicoService {
	@Autowired
	private IInformeMedicoDao informeMedicoDao;

	@Override
	@Transactional(readOnly = true)
	public List<InformeMedico> findAll() {
		return (List<InformeMedico>) informeMedicoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<InformeMedico> findAll(Pageable pageable) {
		return informeMedicoDao.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public InformeMedico findById(Long id) {
		return informeMedicoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public List<InformeMedico> finByPersonaMayor(Long idPersonaMayor) {
		return informeMedicoDao.obtenerInformeMedicoPersonaMayor(idPersonaMayor);
	}

	@Override
	@Transactional
	public InformeMedico saveUpdate(InformeMedico usuario) {
		return informeMedicoDao.save(usuario);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		informeMedicoDao.deleteById(id);

	}

}

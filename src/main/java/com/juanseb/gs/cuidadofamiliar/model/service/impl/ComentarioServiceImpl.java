package com.juanseb.gs.cuidadofamiliar.model.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import com.juanseb.gs.cuidadofamiliar.model.dao.IComentarioDao;
import com.juanseb.gs.cuidadofamiliar.model.entity.Comentario;
import com.juanseb.gs.cuidadofamiliar.model.service.inter.IComentarioService;

public class ComentarioServiceImpl implements IComentarioService {
	@Autowired
	private IComentarioDao comentarioDao;

	@Override
	@Transactional(readOnly = true)
	public List<Comentario> findAll() {
		return (List<Comentario>) comentarioDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Comentario> findAll(Pageable pageable) {
		return comentarioDao.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Comentario findById(Long id) {
		return comentarioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Comentario> finByPersonaMayor(Long idPersonaMayor) {
		return comentarioDao.obtenerComentariosPersonaMayor(idPersonaMayor);
	}

	@Override
	@Transactional
	public Comentario saveUpdate(Comentario usuario) {
		return comentarioDao.save(usuario);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		comentarioDao.deleteById(id);

	}

}

package com.juanseb.gs.cuidadofamiliar.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.juanseb.gs.cuidadofamiliar.model.dao.IUsuarioDao;
import com.juanseb.gs.cuidadofamiliar.model.entity.Usuario;
import com.juanseb.gs.cuidadofamiliar.model.service.inter.IUsuarioService;

import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioDao usuarioDao;

	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Usuario> findAll(Pageable pageable) {
		return usuarioDao.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Long id) {
		return usuarioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Usuario saveUpdate(Usuario usuario) {
		return usuarioDao.save(usuario);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		usuarioDao.deleteById(id);

	}

	@Override
	public List<Usuario> findByPersonaMayor(Long idPersonaMayor) {
		return usuarioDao.obtenerUsuarioPersonaMayor(idPersonaMayor);
	}

}

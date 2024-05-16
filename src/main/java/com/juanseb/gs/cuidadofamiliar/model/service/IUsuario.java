package com.juanseb.gs.cuidadofamiliar.model.service;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.juanseb.gs.cuidadofamiliar.model.entity.Usuario;

public interface IUsuario {

	public List<Usuario> findAll();

	public Page<Usuario> findAll(Pageable pageable);

	public Usuario findById(Long id);

	public Usuario saveUpdate(Usuario usuario);

	public void delete(Long id);

}

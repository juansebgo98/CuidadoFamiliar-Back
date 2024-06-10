package com.juanseb.gs.cuidadofamiliar.model.service.inter;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.juanseb.gs.cuidadofamiliar.model.entity.Usuario;

public interface IUsuarioService {

	public List<Usuario> findAll();

	public Page<Usuario> findAll(Pageable pageable);

	public Usuario findById(Long id);

	public List<Usuario> findByPersonaMayor(Long idPersonaMayor);

	public Usuario saveUpdate(Usuario usuario);

	public void delete(Long id);

}

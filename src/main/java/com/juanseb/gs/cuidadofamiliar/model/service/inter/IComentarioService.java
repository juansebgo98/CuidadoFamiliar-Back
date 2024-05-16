package com.juanseb.gs.cuidadofamiliar.model.service.inter;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.juanseb.gs.cuidadofamiliar.model.entity.Comentario;

public interface IComentarioService {

	public List<Comentario> findAll();

	public Page<Comentario> findAll(Pageable pageable);

	public List<Comentario> finByPersonaMayor(Long idPersonaMayor);

	public Comentario findById(Long id);

	public Comentario saveUpdate(Comentario comentario);

	public void delete(Long id);

}

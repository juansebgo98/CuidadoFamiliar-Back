package com.juanseb.gs.cuidadofamiliar.model.service.inter;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.juanseb.gs.cuidadofamiliar.model.entity.PersonaMayor;

public interface IPersonaMayorService {

	public List<PersonaMayor> findAll();

	public Page<PersonaMayor> findAll(Pageable pageable);

	public PersonaMayor findById(Long id);

	public List<PersonaMayor> obtenerPersonaMayorDeUsuario(Long usuarioId);
	
	public PersonaMayor obtenerPersonaMayorDeCitaMedica(Long citaMedicaId);

	public PersonaMayor saveUpdate(PersonaMayor usuario);

	public void delete(Long id);

}

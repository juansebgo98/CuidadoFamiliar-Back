package com.juanseb.gs.cuidadofamiliar.model.service.inter;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.juanseb.gs.cuidadofamiliar.model.entity.InformeMedico;

public interface IInformeMedicoService {

	public List<InformeMedico> findAll();

	public Page<InformeMedico> findAll(Pageable pageable);

	public List<InformeMedico> finByPersonaMayor(Long idPersonaMayor);

	public InformeMedico findById(Long id);

	public InformeMedico saveUpdate(InformeMedico comentario);

	public void delete(Long id);

}

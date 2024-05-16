package com.juanseb.gs.cuidadofamiliar.model.service;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.juanseb.gs.cuidadofamiliar.model.entity.CitaMedica;

public interface ICitaMedica {

	public List<CitaMedica> findAll();

	public Page<CitaMedica> findAll(Pageable pageable);

	public List<CitaMedica> finByPersonaMayor(Long idPersonaMayor);

	public CitaMedica findById(Long id);

	public CitaMedica saveUpdate(CitaMedica citaMedica);

	public void delete(Long id);

}

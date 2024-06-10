package com.juanseb.gs.cuidadofamiliar.model.service.inter;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.juanseb.gs.cuidadofamiliar.model.entity.Medicamento;

public interface IMedicamentoService {

	public List<Medicamento> findAll();

	public Page<Medicamento> findAll(Pageable pageable);

	public Medicamento findById(Long id);

	public List<Medicamento> findByPersonaMayor(Long idPersonaMayor);

	public Medicamento saveUpdate(Medicamento medicamento);

	public void delete(Long id);

}

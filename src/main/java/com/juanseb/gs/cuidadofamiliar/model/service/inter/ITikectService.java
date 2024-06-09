package com.juanseb.gs.cuidadofamiliar.model.service.inter;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.juanseb.gs.cuidadofamiliar.model.entity.Ticket;


public interface ITikectService {

	//DAO basicas
	public List<Ticket> findAll();

	public Page<Ticket> findAll(Pageable pageable);

	public Ticket findById(Long id);
	
	public Ticket saveUpdate(Ticket Tiket);

	public void delete(Long id);
	

	//DAO implementadas.
	public List<Ticket> obtenerTiketsPersonaMayor(Long personaMayorId);
	
	public Ticket obtenerTicketCitaMedica(Long citaMedicaId);

	public List<Ticket> obtenerTiketsUtilizados();
	
	public List<Ticket> obtenerTiketsNoUtilizados();

	
}

package com.juanseb.gs.cuidadofamiliar.model.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import com.juanseb.gs.cuidadofamiliar.model.dao.ITicketDao;
import com.juanseb.gs.cuidadofamiliar.model.entity.Ticket;
import com.juanseb.gs.cuidadofamiliar.model.service.inter.ITikectService;

public class TicketServiceImpl implements ITikectService{

	private ITicketDao TicketDao;

	@Override
	@Transactional(readOnly = true)
	public List<Ticket> findAll(){
		return TicketDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Ticket> findAll(Pageable pageable){
		return TicketDao.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Ticket findById(Long id) {
		return TicketDao.findById(id).orElse(null);
	}
	
	public Ticket saveUpdate(Ticket Tiket) {
		return TicketDao.save(Tiket);
	}

	public void delete(Long id) {
		TicketDao.deleteById(id);
	}
	

	//DAO implementadas.
	@Override
	@Transactional(readOnly = true)
	public List<Ticket> obtenerTiketsPersonaMayor(Long personaMayorId){
		return TicketDao.obtenerTiketsPersonaMayor(personaMayorId);
	}
	@Override
	@Transactional(readOnly = true)
	public Ticket obtenerTicketCitaMedica(Long citaMedicaId) {
		return TicketDao.obtenerTicketCitaMedica(citaMedicaId);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Ticket> obtenerTiketsUtilizados(){
		return TicketDao.obtenerTiketsUtilizados();
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Ticket> obtenerTiketsNoUtilizados(){
		return TicketDao.obtenerTiketsNoUtilizados();
	}

}
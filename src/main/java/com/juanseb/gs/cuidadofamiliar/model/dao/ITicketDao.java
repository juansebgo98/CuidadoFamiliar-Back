package com.juanseb.gs.cuidadofamiliar.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.juanseb.gs.cuidadofamiliar.model.entity.Ticket;
// LISTO,					LISTO									
//Ticjets persona mayor, tickest correspondientes a una cita,  han sido utilizados, y los que no.

public interface ITicketDao extends JpaRepository<Ticket, Long>{
	
	// Implementacion de query para base de datos
	@Query("SELECT Tk from Tickets as Tk INNER JOIN PersonaMayor as Pm ON Tk.personaMayor.id = Pm.id WHERE  Pm.id =:personaMayorId")
	public List<Ticket> obtenerTiketsPersonaMayor(@Param("personaMayorId") Long personaMayorId);
	
	@Query("SELECT Tk from Tickets as Tk INNER JOIN CitaMedica as Cm ON Tk.citaMedica.id = Cm.id WHERE Cm.id= :citaMedicaId")
	public Ticket obtenerTicketCitaMedica(@Param("citaMedicaId") Long citaMedicaId );
	
	@Query("SELECT Tk from Tickets as Tk WHERE Tk.citaMedica != NULL")
	public List<Ticket> obtenerTiketsUtilizados();
	
	@Query("SELECT Tk from Tickets as Tk WHERE Tk.citaMedica = NULL")
	public List<Ticket> obtenerTiketsNoUtilizados();
}

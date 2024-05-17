package com.juanseb.gs.cuidadofamiliar.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juanseb.gs.cuidadofamiliar.model.entity.Citamedica;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class CitaMedicaRestController {

	@Autowired
	// private IPersonaMayorService personaMayorService;

	@GetMapping("/citaMedica")
	public List<Citamedica> index() {
		// TODO return personaMayorService.findAll();
		return null;
	}

	@GetMapping("/citaMedica/PersonaMayor/{id}")
	public ResponseEntity<?> index(@PathVariable Long id) {
		Map<String, Object> response = new HashMap<>();
		// List<PersonaMayor> almacenamiento =
		// personaMayorService.obtenerCitaMedicaPersonaMayor(id);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
	}
}

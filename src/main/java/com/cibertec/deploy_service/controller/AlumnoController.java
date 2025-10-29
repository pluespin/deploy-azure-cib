package com.cibertec.deploy_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.deploy_service.model.Alumno;
import com.cibertec.deploy_service.service.AlumnoServiceImpl;

@RestController
@RequestMapping("/api/alumno")
public class AlumnoController {

	private AlumnoServiceImpl service;
	
	public AlumnoController(AlumnoServiceImpl service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Alumno> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Alumno buscar(@PathVariable(name="id") Integer id) {
		return service.buscar(id);
	}
	
	@PostMapping
	public Alumno guardar(@RequestBody Alumno alumno) {
		return service.registrar(alumno);
	}
	
	@PutMapping
	public Alumno actualizar(@RequestBody Alumno alumno) {
		return service.actualizar(alumno);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar (@PathVariable(name="id") Integer id) {
		service.eliminar(id);
	}
}	

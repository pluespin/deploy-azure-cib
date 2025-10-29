package com.cibertec.deploy_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cibertec.deploy_service.model.Alumno;
import com.cibertec.deploy_service.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService{
	
	private AlumnoRepository repo;
	
	public AlumnoServiceImpl(AlumnoRepository repo) {
		this.repo = repo;
	}

	@Override
	public List<Alumno> listar() {
		return repo.findAll();
	}

	@Override
	public Alumno buscar(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Alumno registrar(Alumno alumno) {
		return repo.save(alumno);
	}

	@Override
	public Alumno actualizar(Alumno alumno) {
		return repo.save(alumno);
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

}

package com.cibertec.deploy_service.service;

import java.util.List;

import com.cibertec.deploy_service.model.Alumno;

public interface AlumnoService {
	List<Alumno> listar();
	Alumno buscar(Integer id);
	Alumno registrar(Alumno alumno);
	Alumno actualizar(Alumno alumno);
	void eliminar(Integer id);
}

package com.cibertec.deploy_service.model;

import java.time.LocalDate;

import com.cibertec.deploy_service.model.Alumno;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="alumno")
public class Alumno {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String apellido;
	private Integer edad;
	private String correo;
	@Column(name="fecha_registro")
	private LocalDate fechaRegistro;
}
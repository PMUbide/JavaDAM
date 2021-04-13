package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Usuario;

/**
 * interfaz que va a usar el servico. Debe contener los métodos que ejecutan las
 * consultas en la BD.
 */
public interface IAlumnoService {
	// Devuelve una lista con todos los alumnos de la BD
	public List<Usuario> findAll();
	// Añade un nuevo alumno en la BD
	public boolean addAlumno(Usuario alumno);
}
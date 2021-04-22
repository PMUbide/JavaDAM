package com.proyectoSpring.service;

import java.util.List;

import com.proyectoSpring.model.Usuario;

public interface IUsuarioService {
	// Devuelve una lista con todos los alumnos de la BD
		public List<Usuario> findAll();
		// Añade un nuevo alumno en la BD
		public boolean addUsuario(Usuario usuario);
}

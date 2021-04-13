package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Usuario;
import com.example.demo.repository.AlumnoRepository;

/**
 * Servicio que trabaja y realiza consultas en la BD sobre los datos
 * de tipo alumno. Implementa la interfaz correspondiente. 
 * En los servicios es donde se desarrollan los algoritmos y se programan
 * los métodos implementados de la interfaz.
 */
@Service
public class AlumnoServiceImpl implements IAlumnoService {
	
	@Autowired
    private AlumnoRepository repository;
	
	@Override
	public List<Usuario> findAll() {
		/*
		 * Ejecuta la consulta "select * from alumno".
		 * Recuerda que repository implementaba la interfaz CrudRepository.
		 * ¡Investiga qué consultas se pueden hacer de manera sencilla!
		 */
		System.out.println("HACE EL SELECT");
		return (List<Usuario>) repository.findAll();
	}

	@Override
	public boolean addAlumno(Usuario alumno) {
		try {
			/*
			 * Ejecuta la consulta "insert alumno".
			 * Recuerda que repository implementaba la interfaz CrudRepository.
			 * ¡Investiga qué consultas se pueden hacer de manera sencilla!
			 */
			repository.save(alumno);
			return true;
		} catch(Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}
}
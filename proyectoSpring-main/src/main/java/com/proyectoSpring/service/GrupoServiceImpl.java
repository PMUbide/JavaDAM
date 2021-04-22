package com.proyectoSpring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyectoSpring.model.Grupo;
import com.proyectoSpring.repository.GrupoRepository;

@Service
public class GrupoServiceImpl implements IGrupoService {

	private GrupoRepository repository;
	
	@Override
	public List<Grupo> findAll() {
		return (List<Grupo>) repository.findAll();
	}

	@Override
	public boolean addGrupo(Grupo grupo) {
		// TODO Auto-generated method stub
		try {
			/*
			 * Ejecuta la consulta "insert alumno".
			 * Recuerda que repository implementaba la interfaz CrudRepository.
			 * ¡Investiga qué consultas se pueden hacer de manera sencilla!
			 */
			repository.save(grupo);
			return true;
		} catch(Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}

}

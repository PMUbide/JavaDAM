package com.proyectoSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectoSpring.model.Grupo;
import com.proyectoSpring.repository.GrupoRepository;

@Service
public class GrupoServiceImpl implements IGrupoService {
	@Autowired
	private GrupoRepository repository;
	
	@Override
	public List<Grupo> findAll() {
		return (List<Grupo>) repository.findAll();
	}

	@Override
	public boolean addGrupo(Grupo grupo) {
		// TODO Auto-generated method stub
		try {
			
			
			
			repository.save(grupo);
			return true;
		} catch(Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}

}

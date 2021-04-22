package com.proyectoSpring.service;

import java.util.List;


import com.proyectoSpring.model.Grupo;


public interface IGrupoService {
	public List<Grupo> findAll();
	public boolean addGrupo(Grupo grupo);
}

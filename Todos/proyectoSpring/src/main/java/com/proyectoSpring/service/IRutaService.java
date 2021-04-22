package com.proyectoSpring.service;

import java.util.List;


import com.proyectoSpring.model.Ruta;


public interface IRutaService {
	public List<Ruta> findAll();
	public boolean addRuta(Ruta ruta);
}

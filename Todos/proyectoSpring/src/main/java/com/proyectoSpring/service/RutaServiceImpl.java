package com.proyectoSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectoSpring.model.Ruta;
import com.proyectoSpring.repository.RutaRepository;
@Service
public class RutaServiceImpl implements IRutaService {

	@Autowired
	private RutaRepository repository;

	@Override
	public List<Ruta> findAll() {
		return (List<Ruta>) repository.findAll();
	}

	@Override
	public boolean addRuta(Ruta ruta) {
		try {
			/*
			 * Ejecuta la consulta "insert ruta". Recuerda que repository implementaba la
			 * interfaz CrudRepository. ¡Investiga qué consultas se pueden hacer de manera
			 * sencilla!
			 */
			System.out.println("Add ruta antes findall");
			List<Ruta> rutas = findAll();
			System.out.println("Add ruta después findall");
			boolean urlRepetida = false;
			boolean nombreRepetido = false;
			for (Ruta ru : rutas) {
				if(ru.getUrl_map() != null) {
					if (ru.getUrl_map().equals(ruta.getUrl_map().toLowerCase())) {
						urlRepetida = true;
						break;
					}
					if (ru.getNombre().equals(ruta.getNombre().toLowerCase())) {
						urlRepetida = true;
						break;
					}
				}
			}
			if (urlRepetida) {
				System.out.println("Ya existe esa URL de ruta");
				return false;
			} else if (nombreRepetido) {
				System.out.println("Ya existe ese nombre de ruta");
				return false;
			} else {
				repository.save(ruta);
				return true;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}
}

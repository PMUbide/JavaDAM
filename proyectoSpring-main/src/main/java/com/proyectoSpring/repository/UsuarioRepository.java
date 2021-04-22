package com.proyectoSpring.repository;

import org.springframework.data.repository.CrudRepository;

import com.proyectoSpring.model.Usuario;

/**
 * Esta interfaz vacía se utiliza para extender CrudRepository, 
 * que al heredarlo nos permite realizar consultas sobre la BD
 * utilizando la entidad alumno. Por ejemplo, devuelveme todos
 * los alumnos, insertame un nuevo alumno...
 */
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {


}
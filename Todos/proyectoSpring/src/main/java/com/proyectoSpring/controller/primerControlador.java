package com.proyectoSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.proyectoSpring.model.Usuario;
import com.proyectoSpring.service.IUsuarioService;

@Controller
public class primerControlador {

	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/")
    public String operacionDeInicio(Model model) {
		System.out.println("Entro en el controlador: ");
    	// Ejecutamos la query "select * from alumnos" para obtener
    	// todos los alumnos de la BD
        List<Usuario> usuarios = (List<Usuario>) usuarioService.findAll();
        // Muestra por consola todos los alumnos a modo de prueba
        System.out.println("usuarios size = " + usuarios.size());
        System.out.println(usuarios.get(2).getNombre());
        for(int i = 0; i < usuarios.size(); i++) {
        	System.out.println(usuarios.get(i).getIdUser() + " - " + usuarios.get(i).getNombre() + " - ");
        }
        // Envía los alumnos al html, para poder listarlos
        model.addAttribute("usuarios", usuarios);
        return "index";
    }
	
    @PostMapping(value = "/usuarios/agregar")
    public String agregarAlumno(@ModelAttribute Usuario usuario, Model model) {
    	// Ejecuta la query "insert alumno"
    	System.out.println("ESTOY ANTES DE USUARIO SERVICE");
        usuarioService.addUsuario(usuario);
        /*
         * Como explique en clase, una vez se ha añadido un nuevo alumno queremos
         * volver a cargar el index.html. Ya sabemos que este index necesita de una
         * lista de alumnos para cargarse bien (la lista que mostramos), por lo tanto
         * volvemos a solicitarla haciendo la query "select * from alumnos"
         * y se la volvemos a mandar al index.html
         */
        List<Usuario> usuarios = (List<Usuario>) usuarioService.findAll();
        System.out.println("Usuarios size = " + usuarios.size());
        for(int i = 0; i < usuarios.size(); i++) {
        	System.out.println(usuarios.get(i).getIdUser() + " - " + usuarios.get(i).getNombre());
        }
        model.addAttribute("usuarios", usuarios);
        return "index";
    }
}

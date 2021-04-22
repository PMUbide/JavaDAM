
package com.proyectoSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyectoSpring.model.Grupo;
import com.proyectoSpring.service.IGrupoService;

@RequestMapping(path = "/rutas")
@Controller
public class GrupoControlador {
	
	@Autowired
	private IGrupoService grupoService;
	
	@GetMapping("/grupo")
    public String operacionGrupo(Model model) {
        List<Grupo> grupos= (List<Grupo>) grupoService.findAll();
        System.out.println("EA");
        // Muestra por consola todos los alumnos a modo de prueba
        // Envía los alumnos al html, para poder listarlos
        model.addAttribute("grupos", grupos);
        return "grupo.html";
    }
}

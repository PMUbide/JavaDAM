
package com.proyectoSpring.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyectoSpring.model.Grupo;
import com.proyectoSpring.model.Ruta;
import com.proyectoSpring.service.IGrupoService;
import com.proyectoSpring.service.IRutaService;

//@RequestMapping(path = "/grupo/agregar")
@Controller
public class GrupoControlador {
	
	@Autowired
	private IGrupoService grupoService;
	@Autowired
	private IRutaService rutaService;
	
	@GetMapping("/grupo")
    public String operacionGrupo(Model model) {
        List<Grupo> grupos= (List<Grupo>) grupoService.findAll();
        System.out.println("EA");
        List<Ruta> rutas = (List<Ruta>) rutaService.findAll();
        // Muestra por consola todos los alumnos a modo de prueba
        // Envía los alumnos al html, para poder listarlos
        model.addAttribute("grupos", grupos);
        model.addAttribute("rutas", rutas);
        return "grupo";
    }
	
	@PostMapping(value = "/grupo/agregar")
	//@ResponseBody
    public String agregarRuta(@ModelAttribute Grupo grupo, Model model, @RequestParam(value = "hora_salida", required = false) String hora_salida,
    		@RequestParam(value = "fecha_salida", required = false) String fecha_salida) {
		System.out.println(hora_salida);
		grupo.setFecha_creacion(new Date().toString());
		grupo.setFecha_salida(fecha_salida + " " + hora_salida);
        grupoService.addGrupo(grupo);
        List<Grupo> grupos = (List<Grupo>) grupoService.findAll();
        model.addAttribute("grupos", grupos);
        return "grupo";
	}
}

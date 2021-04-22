package com.proyectoSpring.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;

import com.proyectoSpring.model.Ruta;
import com.proyectoSpring.service.IRutaService;
//@RestController
@Controller
public class RutaControlador {
	
	@Autowired
	private IRutaService rutaService;
	@GetMapping("/rutasCycle")
	//@ResponseBody
    public String operacionDeInicio(Model model) {
		System.out.println("Entro en el controlador: ");
        List<Ruta> rutas = (List<Ruta>) rutaService.findAll();
        System.out.println("rutas size = " + rutas.size());
        for(int i = 0; i < rutas.size(); i++) {
        	System.out.println(rutas.get(i).getId_ruta() + " - " + rutas.get(i).getNombre());
        }
        // Envía los alumnos al html, para poder listarlos
        model.addAttribute("rutas", rutas);
        return "rutasCycle";
    }
	@PostMapping(value = "/rutasCycle/agregar")
	//@ResponseBody
    public String agregarRuta(@ModelAttribute Ruta ruta, Model model) {
		System.out.println("Recibo la ruta con nombre: " + ruta.getNombre());
        rutaService.addRuta(ruta);
        List<Ruta> rutas = (List<Ruta>) rutaService.findAll();
        System.out.println("Rutas size = " + rutas.size());
        for(int i = 0; i < rutas.size(); i++) {
        	System.out.println(rutas.get(i).getId_user() + " - " + rutas.get(i).getNombre());
        }
        model.addAttribute("rutas", rutas);
        return "rutasCycle";
	}
}

package com.Spring.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Spring.Dominio.Persona;
import com.Spring.dao.PersonaDao;
import com.Spring.servicio.PersonaService;

@Controller

public class Holamundo {
	@Autowired
	private PersonaService personaService;

	@GetMapping("/p")
	public String saludo(Model model) {
		Iterable<Persona> personas = personaService.listarPersona();
		// List<Persona> personas=new ArrayList();
		// personas.add(persona);

		model.addAttribute("personas", personas);
		return "index";
	}

	@GetMapping("/agregar")
	public String agregar(Persona persona) {
		return "modificar";
	}
	@PostMapping("/guardar")
	public String guardar(Persona persona) {
	
		
		personaService.guardar(persona);
		return "redirect:/p";
		
	}
	@GetMapping("/editar/{idPersona}")
	public String editar(Persona persona, Model model) {
		persona= personaService.encontrarpersona(persona);
		model.addAttribute("persona", persona);
		return "modificar";
	}
	@GetMapping("/eliminar/{idPersona}")
	public String eliminar(Persona persona) {
		personaService.eliminar(persona);
		return "redirect:/p";
		
	}
}

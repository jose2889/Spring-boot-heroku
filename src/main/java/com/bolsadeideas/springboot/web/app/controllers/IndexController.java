package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/api")
public class IndexController {

	@GetMapping({"/","/index"})
	public String index(Model model) {
		model.addAttribute("titulo", "Hola Venezuela!!!");
		return "index";
	}
	
//	@RequestMapping("/perfil")
	@GetMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Jose");
		usuario.setApellido("Hernandez");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Usuario: ".concat(usuario.getNombre()));
		return "perfil";
	}
}

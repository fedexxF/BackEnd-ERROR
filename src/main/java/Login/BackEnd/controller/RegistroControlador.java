package Login.BackEnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Login.BackEnd.service.UsuarioService;
import org.springframework.web.bind.annotation.PatchMapping;

@Controller
public class RegistroControlador {

	@Autowired
	private UsuarioService service;
	
	@GetMapping("/login")
	public String iniciarSesion() {
		return "login";
	}
	
	@GetMapping("/")
	public String verPaginaDeInicio(Model modelo) {
		modelo.addAttribute("usuarios", service.listarUsuarios());
		return "usuario";
	}
	@GetMapping("/admin")
	public String verPaginaAdmin(Model modelo) {
		modelo.addAttribute("ADMIN", service.listarUsuarios());
		return "admin";
	}
}

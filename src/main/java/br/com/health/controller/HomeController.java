package br.com.health.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.health.dao.ClinicaDAO;

@Controller
public class HomeController {

	@Autowired
	private ClinicaDAO dao;

	@GetMapping("/")
	public ModelAndView index() {
		return new ModelAndView("home/index").addObject("clinicas", dao.listar());
	}
	
	@GetMapping("/dashboard")
	public String dashboard() {
		return "home/dashboard";
	}
	
	@GetMapping("/deslogar")
	public String deslogar() {
		return "home/deslogar";
	}
	
}
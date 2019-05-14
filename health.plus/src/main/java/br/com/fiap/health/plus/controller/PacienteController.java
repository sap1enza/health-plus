package br.com.fiap.health.plus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.health.plus.dao.PacienteDAO;
import br.com.fiap.health.plus.entity.Paciente;

@Controller
public class PacienteController {
		
	@Autowired
	private PacienteDAO dao;

	@GetMapping("/paciente/cadastro")
	public String abrirForm(Paciente paciente) {
		return "/paciente/cadastro";
	}

	@Transactional
	@PostMapping("/paciente/cadastro")
	public ModelAndView processarForm(Paciente paciente, RedirectAttributes redirect) {
	  try {
	    dao.cadastrar(paciente);
	  }catch(Exception e) {
	    return new ModelAndView("/paciente/cadastro").addObject("msg", e.getMessage());
	  }
	  redirect.addFlashAttribute("msg", "Cadastro realizado");
	  return new ModelAndView("redirect:/paciente/cadastro");
	}
}

package br.com.fiap.health.plus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.health.plus.dao.PacienteDAO;
import br.com.fiap.health.plus.entity.Paciente;

@Controller
@RequestMapping("paciente")
public class PacienteController {
	
	@Autowired
	private PacienteDAO dao;

	@GetMapping("cadastrar")
	public String abrirForm(Paciente paciente) {
		return "paciente/cadastro";
	}
	
	@PostMapping("cadastrar")
	@Transactional
	public ModelAndView processarForm(Paciente paciente, RedirectAttributes attr) {
		try {
			dao.cadastrar(paciente);
		} catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("estacionamento/cadastro");
		}
		
		attr.addFlashAttribute("msg", "Cadastrado com sucesso!");
		return new ModelAndView("redirect:/paciente/cadastrar");
	}
	
}

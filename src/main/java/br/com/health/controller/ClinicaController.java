package br.com.health.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.health.dao.ClinicaDAO;
import br.com.health.entity.Clinica;

@Controller
@RequestMapping("clinica")
public class ClinicaController {
	
	@Autowired
	private ClinicaDAO dao;
	
	@GetMapping("cadastrar")
	public String abrirForm(Clinica clinica) {
		return "clinica/cadastrar";
	}
	
	@PostMapping("cadastrar")
	@Transactional
	public ModelAndView processarForm(Clinica clinica, RedirectAttributes attr) {
		try {
			dao.cadastrar(clinica);
		}catch(Exception e) {
			e.printStackTrace();
			return new ModelAndView("clinica/cadastrar");
		}
		
		attr.addFlashAttribute("msg", "Clinica cadastrada com sucesso!");
		return new ModelAndView("redirect:/clinica/cadastrar");
	}
	
	@GetMapping("listar")
	public ModelAndView listar() {
		return new ModelAndView("clinica/listar").addObject("clinicas", dao.listar());
	}
	
	@GetMapping("editar/{id}")
	public ModelAndView editar(@PathVariable("id") int id) {
		return new ModelAndView("clinica/editar").addObject("clinica", dao.buscar(id));
	}
	
	@Transactional
	@PostMapping("editar")
	public ModelAndView editar(Clinica clinica, RedirectAttributes redirect) {
		try {
			dao.atualizar(clinica);
			redirect.addFlashAttribute("msg", "Clínica atualizada");
		}catch(Exception e) {
			return new ModelAndView("clinica/editar").addObject("msg", e.getMessage());
		}
		return new ModelAndView("redirect:/clinica/listar");
	}

	@Transactional
	@PostMapping("excluir")
	public String excluir(int id, RedirectAttributes redirect) {
	  try {
	    dao.remover(id);
	    redirect.addFlashAttribute("msg", "Clínica excluída!");
	  }catch(Exception e) {
	    redirect.addFlashAttribute("msg", e.getMessage());
	  }
	  return "redirect:/clinica/listar";
	}
}
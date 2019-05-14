//package br.com.fiap.health.plus.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import br.com.fiap.health.plus.dao.ClinicaDAO;
//import br.com.fiap.health.plus.dao.PacienteDAO;
//
//@Controller
//@RequestMapping("clinica")
//public class ClinicaController {
//
////	@Autowired
//	private ClinicaDAO dao;
//	
//	@GetMapping("listar")
//	public ModelAndView listar() {
//		System.out.println(dao.listar());
//		return new ModelAndView("clinica/lista").addObject("lista", dao.listar());
//	}
//	
//}

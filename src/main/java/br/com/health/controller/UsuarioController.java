package br.com.health.controller;

import javax.management.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.health.dao.UsuarioDAO;
import br.com.health.entity.Usuario;

@Controller
@RequestMapping("usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioDAO dao;

	@GetMapping("cadastro")
	public String abrirForm(Usuario usuario) {
		return "usuario/cadastro";
	}
	
	@PostMapping("cadastro")
	@Transactional
	public ModelAndView processarForm(Usuario usuario, RedirectAttributes attr) {
		try {
			dao.cadastrar(usuario);
		}catch(Exception e) {
			e.printStackTrace();
			return new ModelAndView("usuario/cadastro");
		}
		
		attr.addFlashAttribute("msg", "Cadastro realizado com sucesso!");
		return new ModelAndView("redirect:/usuario/cadastro");
	}
	
	@GetMapping("entrar")
	public String entrar(Usuario usuario) {
		return "usuario/entrar";
	}
	
	@PostMapping("autenticar")
	public ModelAndView autenticar(@RequestParam("email") String email, @RequestParam("senha") String senha, HttpServletRequest request, RedirectAttributes attr) {
		Usuario usuario = dao.buscarPorEmail(email);
		
		if (usuario == null) {
			attr.addFlashAttribute("msg", "Verifique se preencheu todos os campos!");

			return new ModelAndView("redirect:/usuario/entrar");
		}
		
		String user_email = usuario.getEmail();
	    String user_senha = usuario.getSenha();
		
		if (user_email != null && user_senha != null && !user_email.isEmpty() && !user_senha.isEmpty()) {
			
			if (senha == user_senha && email == user_email) {
				HttpSession session = request.getSession();
				session.setAttribute("usuario", usuario);

				attr.addFlashAttribute("msg", "Login realizado com sucesso!");

				return new ModelAndView("redirect:/home/index");
			} else {
				attr.addFlashAttribute("msg", "Login ou senha inválidos!");

				return new ModelAndView("redirect:/usuario/entrar");
			}
		} else {
			attr.addFlashAttribute("msg", "Verifique se preencheu todos os campos!");

			return new ModelAndView("redirect:/usuario/entrar");
		}

	}
}

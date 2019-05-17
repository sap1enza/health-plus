package br.com.health.dao;

import br.com.health.entity.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario, Integer>{

	Usuario buscarPorEmail(String email);

}
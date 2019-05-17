package br.com.health.dao.impl;

import br.com.health.entity.Usuario;

import java.util.List;

import org.springframework.stereotype.Repository;
import br.com.health.dao.UsuarioDAO;

@Repository
public class UsuarioDAOImpl extends GenericDAOImpl<Usuario, Integer> implements UsuarioDAO{

	public Usuario buscarPorEmail(String email) {
		javax.persistence.Query query = em.createQuery("FROM Usuario WHERE email = :user_email");
		query.setParameter("user_email", email);

		List<Usuario> resultList = query.getResultList();
	
		if (resultList.isEmpty()) {
			return null;
		} else {
			return (Usuario) resultList.get(0);
		}
	}
}
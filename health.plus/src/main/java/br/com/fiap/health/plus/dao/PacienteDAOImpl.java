package br.com.fiap.health.plus.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.fiap.health.plus.entity.Genero;
import br.com.fiap.health.plus.entity.Paciente;

@Repository
public class PacienteDAOImpl extends GenericDAOImpl<Paciente, Integer> implements PacienteDAO{

	public PacienteDAOImpl() {
		super();
	}
	
	public List<Paciente> buscarPorNome(String nome) {
		return em.createQuery("from Paciente p where p.nome like :n", Paciente.class)
				.setParameter("n", "%"+nome+"%").getResultList();
	}
	
	public List<Paciente> buscarPorGenero(Genero genero) {
		return em.createQuery("from Paciente p where p.genero = :g", Paciente.class)
				.setParameter("g", genero).getResultList();
	}
	
}

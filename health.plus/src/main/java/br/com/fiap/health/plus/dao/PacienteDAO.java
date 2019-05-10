package br.com.fiap.health.plus.dao;

import java.util.List;

import br.com.fiap.health.plus.entity.Genero;
import br.com.fiap.health.plus.entity.Paciente;

public interface PacienteDAO extends GenericDAO<Paciente, Integer> {
	
	public List<Paciente> buscarPorNome(String nome);
	
	public List<Paciente> buscarPorGenero(Genero genero);
	
}

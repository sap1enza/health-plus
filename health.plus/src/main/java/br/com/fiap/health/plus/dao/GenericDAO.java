package br.com.fiap.health.plus.dao;

import java.util.List;

public interface GenericDAO<T, K> {

		public void cadastrar(T entidade);
		
		public void atualizar(T entidade);
		
		public T buscar(K chave);
		
		public void remover(K chave) throws Exception;
		
		public List<T> listar();
		
}

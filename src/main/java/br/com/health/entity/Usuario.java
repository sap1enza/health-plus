package br.com.health.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_USUARIO")
public class Usuario {

	@Id
	@Column(name="id_usuario")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="usuario")
	@SequenceGenerator(name="usuario",sequenceName="SQ_T_USUARIO",allocationSize=1)
	private int id;
	
	@Column(name="nome",nullable=false)
	private String nome;

	@Column(name="email",nullable=false)
	private String email;

	@Column(name="senha",nullable=false)
	private String senha;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
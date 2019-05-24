package br.com.health.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;

@Entity
@Table(name="T_CLINICA")
public class Clinica {

	@Id
	@Column(name="id_clinica")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="clinica")
	@SequenceGenerator(name="clinica",sequenceName="SQ_T_CLINICA",allocationSize=1)
	private int id;

	@Expose
	@Column(name="nome",nullable=false)
	private String nome;
	
	@Expose
	@Column(name="email",nullable=false)
	private String email;
	
	@Expose
	@Column(name="especialidade",nullable=false)
	private String especialidade;
	
	@Expose
	@Column(name="endereco")
	private String endereco;
	
	@Expose
	@Column(name="cep",nullable=false)
	private String cep;
	
	@Expose
	@Column(name="telefone")
	private String telefone;

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

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
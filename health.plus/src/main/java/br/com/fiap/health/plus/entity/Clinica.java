package br.com.fiap.health.plus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Clinica {

	@Id
	@SequenceGenerator(name="clinica",sequenceName="sq_clinica",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="clinica")
	@Column(name="id_clinic")
	private int id;
	
	@Column(name="name")
	private String nome;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String senha;
	
	@Column(name="speciality")
	private String especialidade;
	
	@Column(name="address")
	private String endereco;
	
	@Column(name="region")
	private String regiao;
	
	@Column(name="phone_number")
	private String telefone;
	
	@Column(name="cost")
	private int custo;

	public Clinica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Clinica(int id, String nome, String email, String senha, String especialidade, String endereco,
			String regiao, String telefone, int custo) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.especialidade = especialidade;
		this.endereco = endereco;
		this.regiao = regiao;
		this.telefone = telefone;
		this.custo = custo;
	}

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

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getCusto() {
		return custo;
	}

	public void setCusto(int custo) {
		this.custo = custo;
	}	
	
}

package br.com.fiap.health.plus.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Paciente implements Serializable{
	

	@Id
	@SequenceGenerator(name="paciente",sequenceName="sq_paciente",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="paciente")
	@Column(name="user_id")
	private int id;
	
	@Column(name="name")
	private String nome;
	
	@Column(name="email")
	private String email;
	
//	@Column(name="password")
//	private String senha;
	
//	@Column(name="cpf")
//	private String cpf;
	
	@Temporal(TemporalType.DATE)
	@Column(name="birth_date")
	private Calendar dataNasc;
	
	@Enumerated(EnumType.STRING)
	@Column(name="gender", columnDefinition="CHAR")
	private Genero genero;
	
//	@Column(name="phone_number")
//	private String telefone;
	
//	@Column(name="adress")
//	private String endereco;

	public Paciente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Paciente(int id, String nome, String email, Calendar dataNasc, Genero genero) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.dataNasc = dataNasc;
		this.genero = genero;
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

	public Calendar getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Calendar dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
}

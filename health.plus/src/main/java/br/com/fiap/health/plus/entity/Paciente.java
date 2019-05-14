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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="SQ_PACIENTE")
public class Paciente implements Serializable{

	@Id
	@SequenceGenerator(name="paciente",sequenceName="sq_paciente",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="paciente")
	@Column(name="user_id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
//	@Column(name="cpf")
//	private String cpf;
	
	@Temporal(TemporalType.DATE)
	@Column(name="birth_date")
	private Calendar birth_date;
	
	@Enumerated(EnumType.STRING)
	@Column(name="gender", columnDefinition="CHAR")
	private Genero gender;
	
//	@Column(name="phone_number")
//	private String telefone;
	
//	@Column(name="adress")
//	private String endereco;

	public Paciente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Paciente(int id, String name, String email, Calendar birth_date, Genero gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
  	this.senha = senha;
		this.birth_date = birth_date;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Calendar getBirthDate() {
		return birth_date;
	}

	public void setBirthDate(Calendar birth_date) {
		this.birth_date = birth_date;
	}

	public Genero getGender() {
		return gender;
	}

	public void setGenero(Genero gender) {
		this.gender = gender;
	}
	
	
}

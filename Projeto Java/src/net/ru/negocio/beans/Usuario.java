package net.ru.negocio.beans;

import javax.persistence.*;

@Entity
public class Usuario {

	@Id
	private int cpf;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String nome;
	
	//Aparentemente o Hibernate força a existencia de um construtor padrão
	public Usuario() {	}
	
	public Usuario(int cpf, String password, String nome) {
		this.cpf = cpf;
		this.password = password;
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

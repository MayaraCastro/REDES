package net.ru.teste;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity
public class Tested {

	@Id
	@GeneratedValue
	private int cpf;
	private String nome;
	@Column(nullable = true)
	private boolean ok;

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isOk() {
		return ok;
	}

	public void setOk(boolean ok) {
		this.ok = ok;
	}

}

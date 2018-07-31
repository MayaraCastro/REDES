package net.ru.negocio.beans;

import java.util.Calendar;

import javax.persistence.*;

@Entity
public class Teste {
	
	@Id
	@GeneratedValue
	private int id;
	private String descricao;
	private boolean finalizado;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataFinalizacao;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public boolean isFinalizado() {
		return finalizado;
	}
	
	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
	
	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}
	
	public void setDataFinalizacao(Calendar dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}
	
	
	
}

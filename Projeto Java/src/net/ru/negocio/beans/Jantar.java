package net.ru.negocio.beans;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.*;

@Entity
public class Jantar {

	@Id
	@Temporal(TemporalType.DATE)
	private Calendar dia;
	private String salada;
	private String guarnicao;
	private String principal;
	private String sobremesa;
	private String suco;
	private String fastGrill;
	@ManyToMany
	@JoinTable(name = "jantar_vegetariano", joinColumns =
	{@JoinColumn(name = "jantar")}, inverseJoinColumns =
	{@JoinColumn(name = "usuario_vegetariano")})
	private List<Usuario> vegetariano;
	@ManyToMany
	@JoinTable(name = "jantar_dieta", joinColumns =
	{@JoinColumn(name = "jantar")}, inverseJoinColumns =
	{@JoinColumn(name = "usuario_dieta")})
	private List<Usuario> dieta;
	
	public Jantar() {
		this.vegetariano = new ArrayList<Usuario>();
		this.dieta = new ArrayList<Usuario>();
	}
	
	public Jantar(Calendar dia) {
		this.dia = dia;
		this.vegetariano = new ArrayList<Usuario>();
		this.dieta = new ArrayList<Usuario>();
	}

	public Calendar getDia() {
		return dia;
	}

	public void setDia(Calendar dia) {
		this.dia = dia;
	}

	public String getSalada() {
		return salada;
	}

	public void setSalada(String salada) {
		this.salada = salada;
	}

	public String getGuarnicao() {
		return guarnicao;
	}

	public void setGuarnicao(String guarnicao) {
		this.guarnicao = guarnicao;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getSobremesa() {
		return sobremesa;
	}

	public void setSobremesa(String sobremesa) {
		this.sobremesa = sobremesa;
	}

	public String getSuco() {
		return suco;
	}

	public void setSuco(String suco) {
		this.suco = suco;
	}

	public String getFastGrill() {
		return fastGrill;
	}

	public void setFastGrill(String fastGrill) {
		this.fastGrill = fastGrill;
	}

	public List<Usuario> getVegetariano() {
		return vegetariano;
	}

	public List<Usuario> getDieta() {
		return dieta;
	}
	
}

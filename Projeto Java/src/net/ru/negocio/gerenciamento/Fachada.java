package net.ru.negocio.gerenciamento;

import java.util.Calendar;

import net.ru.negocio.beans.Almoco;
import net.ru.negocio.beans.Jantar;
import net.ru.negocio.beans.Usuario;

public class Fachada {

	private GerenciamentoUsuario gu;
	private GerenciamentoCardapio gc;
	private static Fachada instance;

	private Fachada() {
		this.gu = new GerenciamentoUsuario();
		this.gc = new GerenciamentoCardapio();
	}

	public static Fachada getInstance() {
		if (instance == null)
			instance = new Fachada();
		return instance;
	}

	public void conexao(String user, String password) throws Exception {
		gu.conexao(user, password);
	}

	public void login(int cpf, String password) throws Exception {
		gu.login(cpf, password);
	}

	public void logout() throws Exception {
		gu.logout();
	}

	public void atualizaUsuario(Usuario a) throws Exception {
		gu.atualizaUsuario(a);
	}

	public void removeUsuario(int cpf) throws Exception {
		gu.removeUsuario(cpf);
	}

	public void insereUsuario(Usuario i) throws Exception {
		gu.insereUsuario(i);
	}

	public Usuario getLogado() {
		return gu.getLogado();
	}

	public void adicionaAlmoco(Almoco a) throws Exception {
		gc.adicionaAlmoco(a);
	}

	public void adicionaJantar(Jantar j) throws Exception {
		gc.adicionaJantar(j);
	}

	public void adicionaUsuarioVegetarianoAlmoco(Usuario user, Calendar dia) throws Exception {
		gc.adicionaUsuarioVegetarianoAlmoco(user, dia);
	}

	public void adicionaUsuarioDietaAlmoco(Usuario user, Calendar dia) throws Exception {
		gc.adicionaUsuarioDietaAlmoco(user, dia);
	}

	public void adicionaUsuarioVegetarianoJantar(Usuario user, Calendar dia) throws Exception {
		gc.adicionaUsuarioVegetarianoJantar(user, dia);
	}

	public void adicionaUsuarioDietaJantar(Usuario user, Calendar dia) throws Exception {
		gc.adicionaUsuarioDietaJantar(user, dia);
	}

	public Almoco getAlmoco(Calendar dia) {
		return gc.getAlmoco(dia);
	}

	public Jantar getJantar(Calendar dia) {
		return gc.getJantar(dia);
	}

}

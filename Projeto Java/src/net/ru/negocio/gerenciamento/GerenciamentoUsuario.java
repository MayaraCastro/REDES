package net.ru.negocio.gerenciamento;

import net.ru.negocio.beans.Usuario;
import net.ru.persistencia.Persistencia;

public class GerenciamentoUsuario {

	private Persistencia p;
	private Usuario logado;

	public GerenciamentoUsuario() {
		this.p = Persistencia.getInstance();
	}

	public void conexao(String user, String password) throws Exception {
		if (user.isEmpty())
			throw new Exception("Nome de usuário inválido para conexão com banco");
		try {
			p.conexao("data.ru.net", user, password);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	public void login(int cpf, String password) throws Exception {
		Usuario log = (Usuario) p.busca(Usuario.class, cpf);
		if (log == null)
			throw new Exception("Usuário não encontrado");
		if (!log.getPassword().equals(password))
			throw new Exception("Senha incorreta");
		// Aqui vai o código do usuário logado
		this.logado = log;
		System.out.println("Bem vindo " + log.getNome());
	}

	public void logout() throws Exception {
		try {
			p.fechaConexao();
		} catch (Exception e) {
			throw new Exception("Nenhuma conexão aberta");
		}
	}

	public void atualizaUsuario(Usuario a) throws Exception {
		if (a.getCpf() != logado.getCpf())
			throw new Exception("Não é possível modificar o seu cpf");
		try {
			p.atualiza(a);
		} catch (Exception e) {
			throw new Exception("Não foi possível atualizar o usuário");
		}
	}

	public void removeUsuario(int cpf) throws Exception {
		try {
			Usuario remove = (Usuario) p.busca(Usuario.class, cpf);
			p.remove(remove);
		} catch (Exception e) {
			throw new Exception("Usuário não encontrado");
		}
	}

	public void insereUsuario(Usuario i) throws Exception {
		try {
			p.persiste(i);
		} catch (Exception e) {
			throw new Exception("Usuário já existente");
		}
	}

	public Usuario getLogado() {
		return logado;
	}

}

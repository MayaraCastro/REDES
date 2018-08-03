package net.ru.negocio.gerenciamento;

import net.ru.negocio.beans.Usuario;
import net.ru.persistencia.Persistencia;

public class GerenciamentoUsuario {

	private Persistencia p;
	
	public GerenciamentoUsuario() {
		this.p = Persistencia.getInstance();
	}
	
	public void conexao(String user, String password) throws Exception {
		if (user.isEmpty())
			throw new Exception("Nome de usuário inválido para conexão com banco");
		try {
			p.conexao("localhost", user, password);
		} catch (Exception e) {
			throw new Exception("Usuário inexistente para conexão com banco");
		}
	}
	
	public void login(int cpf, String password) throws Exception {
		Usuario log = (Usuario) p.busca(Usuario.class, cpf);
		if (log == null)
			throw new Exception("Usuário não encontrado");
		if (!log.getPassword().equals(password))
			throw new Exception("Senha incorreta");
		//Aqui vai o código do usuário logado
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
		try {
			p.atualiza(a);
		} catch (Exception e) {
			throw new Exception("Não foi possível atualizar o usuário");
		}
	}
	
	public void removeUsuario(Usuario r) throws Exception {
		try {
			p.remove(r);
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
	
}

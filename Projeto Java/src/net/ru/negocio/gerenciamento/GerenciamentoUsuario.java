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
			throw new Exception("Nome de usu�rio inv�lido para conex�o com banco");
		try {
			p.conexao("localhost", user, password);
		} catch (Exception e) {
			throw new Exception("Usu�rio inexistente para conex�o com banco");
		}
	}
	
	public void login(int cpf, String password) throws Exception {
		Usuario log = (Usuario) p.busca(Usuario.class, cpf);
		if (log == null)
			throw new Exception("Usu�rio n�o encontrado");
		if (!log.getPassword().equals(password))
			throw new Exception("Senha incorreta");
		//Aqui vai o c�digo do usu�rio logado
		System.out.println("Bem vindo " + log.getNome());
	}
	
	public void logout() throws Exception {
		try {
			p.fechaConexao();
		} catch (Exception e) {
			throw new Exception("Nenhuma conex�o aberta");
		}
	}
	
	public void atualizaUsuario(Usuario a) throws Exception {
		try {
			p.atualiza(a);
		} catch (Exception e) {
			throw new Exception("N�o foi poss�vel atualizar o usu�rio");
		}
	}
	
	public void removeUsuario(Usuario r) throws Exception {
		try {
			p.remove(r);
		} catch (Exception e) {
			throw new Exception("Usu�rio n�o encontrado");
		}
	}
	
	public void insereUsuario(Usuario i) throws Exception {
		try {
			p.persiste(i);
		} catch (Exception e) {
			throw new Exception("Usu�rio j� existente");
		}
	}
	
}

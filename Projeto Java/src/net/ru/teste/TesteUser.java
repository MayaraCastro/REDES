package net.ru.teste;

import net.ru.negocio.beans.Usuario;
import net.ru.negocio.gerenciamento.GerenciamentoUsuario;

public class TesteUser {

	public static void main(String[] args) {

		GerenciamentoUsuario gu = new GerenciamentoUsuario();
		
		try {
			gu.conexao("root", "");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Usuario user = new Usuario(110109, "12", "Aleatorio");
		try {
			//gu.insereUsuario(user);
			gu.login(user.getCpf(), user.getPassword());
			//gu.removeUsuario(user.getCpf());
			//user.setCpf(11010);
			//user.setPassword("123");
			//gu.atualizaUsuario(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			gu.logout();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}

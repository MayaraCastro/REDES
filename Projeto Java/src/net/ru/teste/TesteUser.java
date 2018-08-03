package net.ru.teste;

import java.util.Calendar;

import net.ru.negocio.beans.Almoco;
import net.ru.negocio.beans.Usuario;
import net.ru.negocio.gerenciamento.GerenciamentoCardapio;
import net.ru.negocio.gerenciamento.GerenciamentoUsuario;

public class TesteUser {

	public static void main(String[] args) {

		GerenciamentoUsuario gu = new GerenciamentoUsuario();
		GerenciamentoCardapio gc = new GerenciamentoCardapio();
		
		try {
			gu.conexao("root", "");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Usuario user = new Usuario(110109874, "12", "Aleatorio");
		Almoco a = new Almoco(Calendar.getInstance());
		try {
			//gu.insereUsuario(user);
			gu.login(user.getCpf(), user.getPassword());
			//gc.adicionaAlmoco(a);
			gc.adicionaUsuarioDietaAlmoco(user, Calendar.getInstance());
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

package net.ru.teste;

import java.util.Calendar;

import net.ru.negocio.beans.Almoco;
import net.ru.negocio.beans.Jantar;
import net.ru.negocio.beans.Usuario;
import net.ru.negocio.gerenciamento.Fachada;

public class TesteUser {

	public static void main(String[] args) {

		Fachada f = Fachada.getInstance();
		
		try {
			f.conexao("root", "");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Usuario user = new Usuario(11010987, "12", "Aleatorio");
		Calendar b = Calendar.getInstance();
		b.set(2018, 7, 6);
		Almoco a = new Almoco(b);
		try {
			//f.insereUsuario(user);
			f.login(user.getCpf(), user.getPassword());
			f.adicionaAlmoco(a);
			f.adicionaJantar(new Jantar(b));
			//f.adicionaUsuarioDietaAlmoco(user, b);
			//f.removeUsuario(user.getCpf());
			//user.setCpf(11010);
			//user.setPassword("123");
			//f.atualizaUsuario(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			f.logout();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}

package net.ru.negocio.gerenciamento;

import java.util.Calendar;

import net.ru.negocio.beans.Almoco;
import net.ru.negocio.beans.Jantar;
import net.ru.negocio.beans.Usuario;
import net.ru.persistencia.Persistencia;

public class GerenciamentoCardapio {

	private Persistencia p;
	
	public GerenciamentoCardapio() {
		this.p = Persistencia.getInstance();
	}
	
	public void adicionaAlmoco(Almoco a) throws Exception {
		try {
			p.persiste(a);
		} catch (Exception e) {
			throw new Exception("Almoço já existente para esse dia");
		}
	}
	
	public void adicionaJantar(Jantar j) throws Exception {
		try {
			p.persiste(j);
		} catch (Exception e) {
			throw new Exception("Jantar já existente para esse dia");
		}	
	}
	
	public void adicionaUsuarioVegetarianoAlmoco(Usuario user, Calendar dia) throws Exception {
		Almoco a = (Almoco) p.busca(Almoco.class, dia);
		for (Usuario aux : a.getVegetariano()) {
			if (aux.getCpf() == user.getCpf())
				throw new Exception("Usuário já cadastrado nesse cardápio");
		}
		a.getVegetariano().add(user);
		p.atualiza(a);
	}
	
	public void adicionaUsuarioDietaAlmoco(Usuario user, Calendar dia) throws Exception {
		Almoco a = (Almoco) p.busca(Almoco.class, dia);
		for (Usuario aux : a.getDieta()) {
			if (aux.getCpf() == user.getCpf())
				throw new Exception("Usuário já cadastrado nesse cardápio");
		}
		a.getDieta().add(user);
		p.atualiza(a);
	}
	
	public void adicionaUsuarioVegetarianoJantar(Usuario user, Calendar dia) throws Exception {
		Jantar j = (Jantar) p.busca(Jantar.class, dia);
		for (Usuario aux : j.getVegetariano()) {
			if (aux.getCpf() == user.getCpf())
				throw new Exception("Usuário já cadastrado nesse cardápio");
		}
		j.getVegetariano().add(user);
		p.atualiza(j);
	}
	
	public void adicionaUsuarioDietaJantar(Usuario user, Calendar dia) throws Exception {
		Jantar j = (Jantar) p.busca(Jantar.class, dia);
		for (Usuario aux : j.getDieta()) {
			if (aux.getCpf() == user.getCpf())
				throw new Exception("Usuário já cadastrado nesse cardápio");
		}
		j.getDieta().add(user);
		p.atualiza(j);
	}
	
	public Almoco getAlmoco(Calendar dia) {
		return (Almoco) p.busca(Almoco.class, dia);
	}
	
	public Jantar getJantar(Calendar dia) {
		return (Jantar) p.busca(Jantar.class, dia);
	}
	
}

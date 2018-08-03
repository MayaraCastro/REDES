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
			throw new Exception("Almo�o j� existente para esse dia");
		}
	}
	
	public void adicionaJantar(Jantar j) throws Exception {
		try {
			p.persiste(j);
		} catch (Exception e) {
			throw new Exception("Jantar j� existente para esse dia");
		}	
	}
	
	public void adicionaUsuarioVegetarianoAlmoco(Usuario user, Calendar dia) {
		Almoco a = (Almoco) p.busca(Almoco.class, dia);
		a.getVegetariano().add(user);
		p.atualiza(a);
	}
	
	public void adicionaUsuarioDietaAlmoco(Usuario user, Calendar dia) {
		Almoco a = (Almoco) p.busca(Almoco.class, dia);
		a.getDieta().add(user);
		p.atualiza(a);
	}
	
	public void adicionaUsuarioVegetarianoJantar(Usuario user, Calendar dia) {
		Jantar j = (Jantar) p.busca(Jantar.class, dia);
		j.getVegetariano().add(user);
		p.atualiza(j);
	}
	
	public void adicionaUsuarioDietaJantar(Usuario user, Calendar dia) {
		Jantar j = (Jantar) p.busca(Jantar.class, dia);
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

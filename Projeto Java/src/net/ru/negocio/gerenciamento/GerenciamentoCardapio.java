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
	
	public void adicionaAlmoco(Almoco a) {
		p.persiste(a);
	}
	
	public void adicionaJantar(Jantar j) {
		p.persiste(j);
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
	
}

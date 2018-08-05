package net.ru.teste;

import java.util.Calendar;

import net.ru.negocio.beans.Almoco;
import net.ru.negocio.beans.Jantar;
import net.ru.negocio.gerenciamento.Fachada;

public class PovoaBanco {

	public static void main(String[] args) {
		
		Fachada f = Fachada.getInstance();
		
		Almoco a = new Almoco();
		Almoco b = new Almoco();
		Almoco c = new Almoco();
		Almoco d = new Almoco();
		Almoco e = new Almoco();
		Jantar j = new Jantar();
		Jantar k = new Jantar();
		Jantar l = new Jantar();
		Jantar m = new Jantar();
		Jantar n = new Jantar();
		
		Calendar segunda = Calendar.getInstance();
		segunda.set(2018, 7, 06);
		Calendar terca = Calendar.getInstance();
		terca.set(2018, 7, 07);
		Calendar quarta = Calendar.getInstance();
		quarta.set(2018, 7, 8);
		Calendar quinta = Calendar.getInstance();
		quinta.set(2018, 7, 9);
		Calendar sexta = Calendar.getInstance();
		sexta.set(2018, 7, 10);
		
		a.setDia(segunda);
		b.setDia(terca);
		c.setDia(quarta);
		d.setDia(quinta);
		e.setDia(sexta);
		
		j.setDia(segunda);
		k.setDia(terca);
		l.setDia(quarta);
		m.setDia(quinta);
		n.setDia(sexta);
		
		a.setEspecialDieta("Peito de frango grelhado");
		a.setEspecialVegetariano("Berinjela a parmegiana");
		a.setFastGrill("Lasanha a bolonhesa");
		a.setGuarnicao("Purê de batatas / Arroz cheiro verde / Feijão carioca");
		a.setPrincipal("Frango assado com ervilhas / Isca de carne a brasileira");
		a.setSalada("Mix de folhas com cebola temperada / Salada alfa (berinjela, rep. roxo, raban. e gerg.");
		a.setSobremesa("Laranja");
		a.setSuco("Manga / Limão");
		
		j.setEspecialDieta("Iscas de Carne Acebolada");
		j.setEspecialVegetariano("Croquete de Milho verde");
		j.setFastGrill("----");
		j.setGuarnicao("Cuscuz");
		j.setPrincipal("Peito de Frango com Ervilhas / Carne Moída com Azeitonas");
		j.setSalada("Mix de folhas com Tomate");
		j.setSobremesa("Laranja");
		j.setSuco("Manga / Limão");
		
		//terca
		
		b.setEspecialDieta("Carne Assada com Milho Verde");
		b.setEspecialVegetariano("Quiche de Cebola");
		b.setFastGrill("Frangi à Moda Kiev");
		b.setGuarnicao("Purê de batatas / Arroz cheiro verde / Feijão carioca");
		b.setPrincipal("Frango assado com ervilhas / Isca de carne a brasileira");
		b.setSalada("Mix de folhas com cebola temperada / Salada alfa (berinjela, rep. roxo, raban. e gerg.");
		b.setSobremesa("Laranja");
		b.setSuco("Manga / Limão");
		
		k.setEspecialDieta("Frango ao Forno com Ervas");
		k.setEspecialVegetariano("Quibe de Forno");
		k.setFastGrill("Parmegiana de Frango");
		k.setGuarnicao("Cuscuz");
		k.setPrincipal("Peito de Frango com Ervilhas / Carne Moída com Azeitonas");
		k.setSalada("Mix de folhas com Tomate");
		k.setSobremesa("Laranja");
		k.setSuco("Manga / Limão");
		
		//quarta
		
		c.setEspecialDieta("Peixe com Abobrinha e Cenoura");
		c.setEspecialVegetariano("Espaguete ao Curry");
		c.setFastGrill("Risoto");
		c.setGuarnicao("Purê de batatas / Arroz cheiro verde / Feijão carioca");
		c.setPrincipal("Frango assado com ervilhas / Isca de carne a brasileira");
		c.setSalada("Mix de folhas com cebola temperada / Salada alfa (berinjela, rep. roxo, raban. e gerg.");
		c.setSobremesa("Laranja");
		c.setSuco("Manga / Limão");
		
		l.setEspecialDieta("Bife com Pimentões");
		l.setEspecialVegetariano("Acarajé Vegetariano");
		l.setFastGrill("Frango com Ovos e Fritas");
		l.setGuarnicao("Cuscuz");
		l.setPrincipal("Peito de Frango com Ervilhas / Carne Moída com Azeitonas");
		l.setSalada("Mix de folhas com Tomate");
		l.setSobremesa("Laranja");
		l.setSuco("Manga / Limão");
		
		//quinta
		
		d.setEspecialDieta("Bife Grelhado com Milho Verde");
		d.setEspecialVegetariano("Berinjela Recheada");
		d.setFastGrill("Crepe");
		d.setGuarnicao("Purê de batatas / Arroz cheiro verde / Feijão carioca");
		d.setPrincipal("Frango assado com ervilhas / Isca de carne a brasileira");
		d.setSalada("Mix de folhas com cebola temperada / Salada alfa (berinjela, rep. roxo, raban. e gerg.");
		d.setSobremesa("Laranja");
		d.setSuco("Manga / Limão");
		
		m.setEspecialDieta("Peito de Frango com Abóbora");
		m.setEspecialVegetariano("Nuggets de Milho com Molho de Queijo");
		m.setFastGrill("Escondidinho");
		m.setGuarnicao("Cuscuz");
		m.setPrincipal("Peito de Frango com Ervilhas / Carne Moída com Azeitonas");
		m.setSalada("Mix de folhas com Tomate");
		m.setSobremesa("Laranja");
		m.setSuco("Manga / Limão");
		
		//sexta
		
		e.setEspecialDieta("Frango Grelhado com Pimentões");
		e.setEspecialVegetariano("Berinjela à Parmegiana");
		e.setFastGrill("Croquete de Frango com Molho Rosê");
		e.setGuarnicao("Purê de batatas / Arroz cheiro verde / Feijão carioca");
		e.setPrincipal("Frango assado com ervilhas / Isca de carne a brasileira");
		e.setSalada("Mix de folhas com cebola temperada / Salada alfa (berinjela, rep. roxo, raban. e gerg.");
		e.setSobremesa("Laranja");
		e.setSuco("Manga / Limão");
		
		n.setEspecialDieta("Peixe com Limão");
		n.setEspecialVegetariano("Bolinho de Arroz com Molho Pesto");
		n.setFastGrill("----");
		n.setGuarnicao("Cuscuz");
		n.setPrincipal("Peito de Frango com Ervilhas / Carne Moída com Azeitonas");
		n.setSalada("Mix de folhas com Tomate");
		n.setSobremesa("Laranja");
		n.setSuco("Manga / Limão");
		
		try {
			f.adicionaAlmoco(a);
			f.adicionaAlmoco(b);
			f.adicionaAlmoco(c);
			f.adicionaAlmoco(d);
			f.adicionaAlmoco(e);
			
			f.adicionaJantar(j);
			f.adicionaJantar(k);
			f.adicionaJantar(l);
			f.adicionaJantar(m);
			f.adicionaJantar(n);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
}

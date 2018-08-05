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
		a.setGuarnicao("Pur� de batatas / Arroz cheiro verde / Feij�o carioca");
		a.setPrincipal("Frango assado com ervilhas / Isca de carne a brasileira");
		a.setSalada("Mix de folhas com cebola temperada / Salada alfa (berinjela, rep. roxo, raban. e gerg.");
		a.setSobremesa("Laranja");
		a.setSuco("Manga / Lim�o");
		
		j.setEspecialDieta("Iscas de Carne Acebolada");
		j.setEspecialVegetariano("Croquete de Milho verde");
		j.setFastGrill("----");
		j.setGuarnicao("Cuscuz");
		j.setPrincipal("Peito de Frango com Ervilhas / Carne Mo�da com Azeitonas");
		j.setSalada("Mix de folhas com Tomate");
		j.setSobremesa("Laranja");
		j.setSuco("Manga / Lim�o");
		
		//terca
		
		b.setEspecialDieta("Carne Assada com Milho Verde");
		b.setEspecialVegetariano("Quiche de Cebola");
		b.setFastGrill("Frangi � Moda Kiev");
		b.setGuarnicao("Pur� de batatas / Arroz cheiro verde / Feij�o carioca");
		b.setPrincipal("Frango assado com ervilhas / Isca de carne a brasileira");
		b.setSalada("Mix de folhas com cebola temperada / Salada alfa (berinjela, rep. roxo, raban. e gerg.");
		b.setSobremesa("Laranja");
		b.setSuco("Manga / Lim�o");
		
		k.setEspecialDieta("Frango ao Forno com Ervas");
		k.setEspecialVegetariano("Quibe de Forno");
		k.setFastGrill("Parmegiana de Frango");
		k.setGuarnicao("Cuscuz");
		k.setPrincipal("Peito de Frango com Ervilhas / Carne Mo�da com Azeitonas");
		k.setSalada("Mix de folhas com Tomate");
		k.setSobremesa("Laranja");
		k.setSuco("Manga / Lim�o");
		
		//quarta
		
		c.setEspecialDieta("Peixe com Abobrinha e Cenoura");
		c.setEspecialVegetariano("Espaguete ao Curry");
		c.setFastGrill("Risoto");
		c.setGuarnicao("Pur� de batatas / Arroz cheiro verde / Feij�o carioca");
		c.setPrincipal("Frango assado com ervilhas / Isca de carne a brasileira");
		c.setSalada("Mix de folhas com cebola temperada / Salada alfa (berinjela, rep. roxo, raban. e gerg.");
		c.setSobremesa("Laranja");
		c.setSuco("Manga / Lim�o");
		
		l.setEspecialDieta("Bife com Piment�es");
		l.setEspecialVegetariano("Acaraj� Vegetariano");
		l.setFastGrill("Frango com Ovos e Fritas");
		l.setGuarnicao("Cuscuz");
		l.setPrincipal("Peito de Frango com Ervilhas / Carne Mo�da com Azeitonas");
		l.setSalada("Mix de folhas com Tomate");
		l.setSobremesa("Laranja");
		l.setSuco("Manga / Lim�o");
		
		//quinta
		
		d.setEspecialDieta("Bife Grelhado com Milho Verde");
		d.setEspecialVegetariano("Berinjela Recheada");
		d.setFastGrill("Crepe");
		d.setGuarnicao("Pur� de batatas / Arroz cheiro verde / Feij�o carioca");
		d.setPrincipal("Frango assado com ervilhas / Isca de carne a brasileira");
		d.setSalada("Mix de folhas com cebola temperada / Salada alfa (berinjela, rep. roxo, raban. e gerg.");
		d.setSobremesa("Laranja");
		d.setSuco("Manga / Lim�o");
		
		m.setEspecialDieta("Peito de Frango com Ab�bora");
		m.setEspecialVegetariano("Nuggets de Milho com Molho de Queijo");
		m.setFastGrill("Escondidinho");
		m.setGuarnicao("Cuscuz");
		m.setPrincipal("Peito de Frango com Ervilhas / Carne Mo�da com Azeitonas");
		m.setSalada("Mix de folhas com Tomate");
		m.setSobremesa("Laranja");
		m.setSuco("Manga / Lim�o");
		
		//sexta
		
		e.setEspecialDieta("Frango Grelhado com Piment�es");
		e.setEspecialVegetariano("Berinjela � Parmegiana");
		e.setFastGrill("Croquete de Frango com Molho Ros�");
		e.setGuarnicao("Pur� de batatas / Arroz cheiro verde / Feij�o carioca");
		e.setPrincipal("Frango assado com ervilhas / Isca de carne a brasileira");
		e.setSalada("Mix de folhas com cebola temperada / Salada alfa (berinjela, rep. roxo, raban. e gerg.");
		e.setSobremesa("Laranja");
		e.setSuco("Manga / Lim�o");
		
		n.setEspecialDieta("Peixe com Lim�o");
		n.setEspecialVegetariano("Bolinho de Arroz com Molho Pesto");
		n.setFastGrill("----");
		n.setGuarnicao("Cuscuz");
		n.setPrincipal("Peito de Frango com Ervilhas / Carne Mo�da com Azeitonas");
		n.setSalada("Mix de folhas com Tomate");
		n.setSobremesa("Laranja");
		n.setSuco("Manga / Lim�o");
		
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

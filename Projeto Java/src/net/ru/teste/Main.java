package net.ru.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.ru.negocio.beans.Teste;

public class Main {
	
	private void testeInsercao() {
		
		Teste teste = new Teste();
		teste.setDescricao("Classe teste");
		teste.setDataFinalizacao(Calendar.getInstance());
		teste.setFinalizado(true);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("teste");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(teste);
		manager.getTransaction().commit();
		
		System.out.println("ID do teste: " + teste.getId());
		
		manager.close();
		factory.close();
		
	}
	
	private void testeBusca(int id) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("teste");
	    EntityManager manager = factory.createEntityManager();

	    Teste encontrado = manager.find(Teste.class, id);

	    System.out.println(encontrado.getDescricao());
	    
	}

	public static void main(String[] args) {
		
		(new Main()).testeInsercao();
		(new Main()).testeBusca(1);

	}

}

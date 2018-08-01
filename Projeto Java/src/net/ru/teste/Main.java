package net.ru.teste;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import net.ru.negocio.beans.Teste;
import net.ru.negocio.beans.Tested;
import net.ru.persistencia.Persistencia;

@SuppressWarnings("unused")
public class Main {
	
	private Persistencia p;
	
	public Main() {
		p = Persistencia.getInstance();
	}
	
	/**
	 * Exemplo de inserção sem a classe de persistência que criei.
	 */
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
	
	private void insereTested(String nome, boolean ok) {
		
		Tested tested = new Tested();
		tested.setNome(nome);
		tested.setOk(ok);
		
		p.iniciaConexao("teste");
		p.persiste(tested);
		p.fechaConexao();
		
	}
	
	private Teste testeBusca(int id) {
		
		p.iniciaConexao("teste");

	    Teste encontrado = (Teste) p.busca(Teste.class, id);

	    System.out.println(encontrado.getDescricao());
	    
		p.fechaConexao();
		
		return encontrado;
	    
	}
	
	private void atualizaTeste(Teste att) {
		
		p.iniciaConexao("teste");
		p.atualiza(att);
		p.fechaConexao();
		
	}
	
	private void removeTeste(int id) {
		
		p.iniciaConexao("teste");
		
	    Teste encontrado = (Teste) p.busca(Teste.class, id);

		p.remove(encontrado);
	    
		p.fechaConexao();
		
	}
	
	/**
	 * Exemplo de busca listas sem a classe de persistência que criei.
	 */
	private void buscaTesteFinalizado(boolean finalizado) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("teste");
	    EntityManager manager = factory.createEntityManager();
	    
	    Query query = manager.createQuery("select t from Teste as t where t.finalizado = "
	    		+ ":paramFinalizado");
	    query.setParameter("paramFinalizado", finalizado);
	    
	    @SuppressWarnings("unchecked")
		List<Teste> lista = query.getResultList();
	    
	    //Esse é um jeito alternativo
	    //List<Teste> lista = manager
	    //        .createQuery("select t from Tarefa as t where t.finalizado = false")
	    //        .getResultList();
	    
	    for (Teste t : lista)
	    	System.out.println(t.getDescricao());
		
	}
	
	private void buscaTestes(boolean finalizado) {
		
		p.iniciaConexao("teste");
		
		String f = (finalizado == true)? "true" : "false";
		
		@SuppressWarnings("unchecked")
		List<Teste> lista = (List<Teste>) p.busca(Teste.class, "finalizado", f);
		
		for (Teste t : lista)
	    	System.out.println(t.getDescricao());
		
	}

	public static void main(String[] args) {
		
		//(new Main()).testeInsercao();				//insere um teste
		/*
		Teste found = (new Main()).testeBusca(2);	//busca um teste de id = 1
		found.setDataFinalizacao(null);				//modifica o teste encontrado de id = 1
		found.setFinalizado(false);
		(new Main()).atualizaTeste(found);			//atualiza o teste no banco
		*/
		//(new Main()).removeTeste(1);				//remove o teste de id = 1
		
		//(new Main()).buscaTesteFinalizado(false); //busca testes que foram finalizados ou não
		//(new Main()).buscaTestes(true);			//o mesmo que o método de cima
		
		//(new Main()).insereTested("João", false);	//insere um tested (teste do 
													//persistence.xml)
		
	}

}

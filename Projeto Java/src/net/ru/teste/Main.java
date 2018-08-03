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
	
	private void insereTested(String nome, boolean ok) {
		Tested tested = new Tested();
		tested.setNome(nome);
		tested.setOk(ok);
		p.persiste(tested);
	}
	
	private Teste testeBusca(int id) {
	    Teste encontrado = (Teste) p.busca(Teste.class, id);
	    System.out.println(encontrado.getDescricao());
		return encontrado;
	}
	
	private void atualizaTeste(Teste att) {
		p.atualiza(att);
	}
	
	private void removeTeste(int id) {
	    Teste encontrado = (Teste) p.busca(Teste.class, id);
		p.remove(encontrado);
	}
	
	private void buscaTestes(boolean finalizado) {
		
		String f = (finalizado == true)? "true" : "false";
		
		@SuppressWarnings("unchecked")
		List<Teste> lista = (List<Teste>) p.busca(Teste.class, "finalizado", f);
		
		for (Teste t : lista)
	    	System.out.println(t.getDescricao());
		
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.p.conexao("localhost", "root", "");
		m.insereTested("Lets go", false);
		m.insereTested("Do this", true);
		m.p.fechaConexao();
		
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

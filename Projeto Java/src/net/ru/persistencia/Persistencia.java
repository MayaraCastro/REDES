package net.ru.persistencia;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.List;

import javax.persistence.EntityManager;

public class Persistencia {

	private EntityManagerFactory factory;
	private EntityManager manager;
	private static Persistencia instance;
	
	private Persistencia() {}
	
	public static Persistencia getInstance() {
		if (instance == null)
			instance = new Persistencia();
		return instance;
	}
	
	public void iniciaConexao(String unitPersistence) {
		if (this.factory == null || !this.factory.isOpen())
			this.factory = Persistence.createEntityManagerFactory(unitPersistence);
		if (this.manager == null || !this.manager.isOpen())
			this.manager = this.factory.createEntityManager();
	}
	
	public void fechaConexao() {
		if (this.factory != null || this.factory.isOpen())
			this.factory.close();
		if (this.manager != null || this.manager.isOpen())
			this.manager.close();
	}
	
	public void persiste(Object p) {
		manager.getTransaction().begin();
		manager.persist(p);
		manager.getTransaction().commit();
	}
	
	public void remove(Object r) {
		manager.getTransaction().begin();
	    manager.remove(r);
		manager.getTransaction().commit();
	}
	
	public void atualiza(Object a) {
		manager.getTransaction().begin();
	    manager.merge(a);
		manager.getTransaction().commit();
	}
	
	public Object busca(Class<?> c, int id) {
		return manager.find(c, id);
	}
	
	public Object busca(Class<?> c, String id) {
		return manager.find(c, id);
	}
	
	public List<?> busca(Class<?> c, String atributo, String chave) {
		return manager.createQuery("select t from " + c.getName() + " as t where t."
						+ atributo + " = " + chave).getResultList();
	}
	
}

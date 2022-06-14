package br.com.projeto.carros.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.projeto.carros.model.Carro;
import br.com.projeto.carros.util.JPAUtil;

public class CarroDao {
	EntityManager em = JPAUtil.getEntityManager();
	
	public void salva(Carro carro) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(carro);
		tx.commit();
		em.close();
	}
}

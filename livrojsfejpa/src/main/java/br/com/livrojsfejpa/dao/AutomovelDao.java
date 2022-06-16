package br.com.livrojsfejpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.com.livrojsfejpa.model.Automovel;
import br.com.projeto.carros.util.JPAUtil;

public class AutomovelDao {

	public void salva(Automovel automovel) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(automovel);
		em.getTransaction().commit();
		em.close();
		System.out.println("Marca: " + automovel.getMarca());
	}

	public List<Automovel> getAutomoveis() {

		List<Automovel> automoveis = null;
		if (automoveis == null) {
			EntityManager em = JPAUtil.getEntityManager();
			String jpql = "SELECT a FROM Automovel a";
			Query q = em.createQuery(jpql, Automovel.class);
			automoveis = q.getResultList();
			em.close();
		}
		return automoveis;
	}

	public void exclui(long id) {
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Automovel automovel = em.find(Automovel.class, id);
		em.remove(automovel);
		tx.commit();
		em.close();
	}

	public Automovel selecionar(Long id) {
		Automovel automovel;
		EntityManager em = JPAUtil.getEntityManager();
		automovel = em.find(Automovel.class, id);
		em.close();
		return automovel;
	}

	public void atualizar(Automovel automovel) {
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(automovel);
		tx.commit();
		em.close();

	}

	/*
	 * public void excluir(long id) throws Exception { EntityManager em =
	 * JpaResourceBean.getEntityManagerFactory().createEntityManager();
	 * 
	 * try { em.getTransaction().begin(); Lembrete lembrete =
	 * em.find(Lembrete.class, id); em.remove(lembrete);
	 * em.getTransaction().commit(); } catch (Exception e) {
	 * em.getTransaction().rollback();
	 * 
	 * throw new Exception(e); } finally { em.close(); } }
	 */

}

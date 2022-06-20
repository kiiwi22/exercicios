package br.com.projeto.carros.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.projeto.carros.model.Carro;
import br.com.projeto.carros.model.Marca;
import br.com.projeto.carros.model.Modelo;
import br.com.projeto.carros.model.Pessoa;
import br.com.projeto.carros.util.JPAUtil;

public class CarroDao {

	public List<Carro> listaCarros() {
		List<Carro> carros = null;

		EntityManager em = JPAUtil.getEntityManager();
		String jpql = "SELECT c FROM Carro c";
		Query q = em.createQuery(jpql, Carro.class);
		carros = q.getResultList();
		em.close();
		return carros;
	}

	public void salva(Carro carro) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(carro);
		em.getTransaction().commit();
		em.close();
		System.out.println("Marca: " + carro.getModelo().getDescricao());
	}

	public List<Marca> listaMarcas() {
		List<Marca> marcas = null;
		EntityManager em = JPAUtil.getEntityManager();
		String jpql = "SELECT m FROM Marca m";
		Query q = em.createQuery(jpql, Marca.class);
		marcas = q.getResultList();
		em.close();
		return marcas;
	}

	public List<Modelo> listaModelos() {
		List<Modelo> modelos = null;
		EntityManager em = JPAUtil.getEntityManager();
		String jpql = "SELECT m FROM Modelo m";
		Query q = em.createQuery(jpql, Modelo.class);
		modelos = q.getResultList();
		em.close();
		return modelos;
	}

	public List<Pessoa> listaPessoas() {
		List<Pessoa> pessoas = null;
		EntityManager em = JPAUtil.getEntityManager();
		String jpql = "SELECT p FROM Pessoa p";
		Query q = em.createQuery(jpql, Pessoa.class);
		pessoas = q.getResultList();
		em.close();
		return pessoas;
	}

}

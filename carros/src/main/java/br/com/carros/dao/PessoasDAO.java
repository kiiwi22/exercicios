package br.com.carros.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.carros.entity.Pessoa;

public class PessoasDAO {
	
	private EntityManagerFactory entityManagerFactory;

	public List<Pessoa> findAll(){
		List<Pessoa> pessoas = new ArrayList<>();
		entityManagerFactory = Persistence.createEntityManagerFactory("carros");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		pessoas = (List<Pessoa>)entityManager.createQuery("select p from Pessoa p").getResultList();
		return pessoas;
	}
}

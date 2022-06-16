package br.com.carros.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.carros.entity.Carro;
import br.com.carros.util.EntityManagerUtil;

public class CarrosDAO {
	
	public List<Carro> findAll(){
		EntityManager entityManager = EntityManagerUtil.getEntityManager();
		return (List<Carro>)entityManager.createQuery("select c from Carro c").getResultList(); 
	}
	 
}

package br.com.carros.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.carros.entity.Pessoa;
import br.com.carros.util.EntityManagerUtil;

public class PessoasDAO {
	
	public List<Pessoa> findAll(){
		EntityManager entityManager = EntityManagerUtil.getEntityManager();
		return (List<Pessoa>)entityManager.createQuery("select p from Pessoa p").getResultList();
	}
}

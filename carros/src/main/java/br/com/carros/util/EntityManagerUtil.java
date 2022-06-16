package br.com.carros.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
	
	private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("carros");
	
	private static final EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	public static EntityManager getEntityManager() {
		return entityManager;
	}
}

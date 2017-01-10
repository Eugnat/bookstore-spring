package com.zazdravnykh.bookstore.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

	private static EntityManagerFactory emf;
	private static EntityManager em;

	static {
		emf = Persistence.createEntityManagerFactory("bookstore_spring");
		em = emf.createEntityManager();
	}

	public static void openEntityManager() {

		emf.createEntityManager();
	}

	public static EntityManager getEntityManager() {

		return em;
	}

	public static void shutdown() {
		em.close();
		emf.close();
	}

}

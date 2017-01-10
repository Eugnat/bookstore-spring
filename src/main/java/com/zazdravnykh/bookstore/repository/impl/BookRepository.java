package com.zazdravnykh.bookstore.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.zazdravnykh.bookstore.domain.Book;
import com.zazdravnykh.bookstore.factory.HibernateUtil;
import com.zazdravnykh.bookstore.repository.BookDAO;

@Repository
public class BookRepository implements BookDAO {

	@Override
	public Book findById(int id) {

		EntityManager em = HibernateUtil.getEntityManager();

		Book book = em.find(Book.class, id);

		return book;

	}

	@Override
	public List<Book> findByAuthor(String author) {

		EntityManager em = HibernateUtil.getEntityManager();

		List<Book> list = em.createQuery("select b from Book b where b.author = :author", Book.class).setParameter("author", author).getResultList();

		return list;

	}

	@Override
	public List<Book> findByTitle(String title) {
		EntityManager em = HibernateUtil.getEntityManager();

		List<Book> list = em.createQuery("select b from Book b where b.author = :title", Book.class).setParameter("title", title).getResultList();

		return list;
	}

	@Override
	public List<Book> findAll() {

		EntityManager em = HibernateUtil.getEntityManager();
		List<Book> list = em.createQuery("select b from Book b", Book.class).getResultList();

		return list;
	}

	@Override
	public void saveBook(Book book) {

		EntityManager em = HibernateUtil.getEntityManager();

		em.persist(book);

	}

	@Override
	public void saveBook(String title, String author) {

		EntityManager em = HibernateUtil.getEntityManager();

		Book book = new Book(title, author);

		em.persist(book);

	}

}

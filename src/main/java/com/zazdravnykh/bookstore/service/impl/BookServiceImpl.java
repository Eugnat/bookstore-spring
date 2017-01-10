package com.zazdravnykh.bookstore.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zazdravnykh.bookstore.domain.Book;
import com.zazdravnykh.bookstore.factory.HibernateUtil;
import com.zazdravnykh.bookstore.repository.BookDAO;
import com.zazdravnykh.bookstore.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookDAO bookDAO;

	@Override
	public List<Book> showAllBooks() {

		EntityManager em = HibernateUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		List<Book> list = bookDAO.findAll();
		tx.commit();
		return list;
	}

	@Override
	public Book showBookById(int id) {

		EntityManager em = HibernateUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Book book = bookDAO.findById(id);
		tx.commit();

		return book;

	}

	@Override
	public void saveBook(String title, String author) {

		EntityManager em = HibernateUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		bookDAO.saveBook(title, author);
		tx.commit();

	}

}

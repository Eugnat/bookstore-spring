package com.zazdravnykh.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.zazdravnykh.bookstore.domain.Book;

public interface BookDAO extends CrudRepository<Book, Integer> {

}

package com.zezai.service;

import com.zezai.domain.Book;

import java.util.List;

public interface BookService {
    boolean save(Book book);

    boolean delete(Integer id);

    boolean update(Book book);

    Book getById(Integer id);

    List<Book> getAll();
}

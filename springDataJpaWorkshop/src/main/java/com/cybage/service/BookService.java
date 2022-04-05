package com.cybage.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cybage.model.Book;
import com.cybage.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

@Service

public class BookService {
	
	
	
	@Autowired
	BookRepository bookRepository;
	
	public void addBook(Book book) {
		bookRepository.save(book);
	}
	public List<Book> getbooks() {
	 return bookRepository.findAll();
	}
	
	public void deletebook(int id) {
		bookRepository.deleteById(id);
	}
	public Book getEmployeeById(int id) {
		Book book= bookRepository.getById(id);
		return book;
	}
	public void updateEmployee(Book book) {
		bookRepository.save(book);
	}
	public List<Book>getEmployeeByName(String name){
		return bookRepository.findByName(name);
	}
	
	
	
	
}
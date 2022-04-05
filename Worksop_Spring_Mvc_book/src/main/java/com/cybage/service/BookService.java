package com.cybage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cybage.model.Book;


@Service    //framework create object
public class BookService {

	

	

	public BookService() {

	
        List<Book> BookList=new ArrayList<Book>();
	
		BookList.add(new Book(101,"sara","mr beean"));
		BookList.add(new Book(102,"Java","mrs nhd"));
		BookList.add(new Book(103,"c++","eng"));
		BookList.add(new Book(104,"Physics","eng"));
		
		
		
	}

	public static List<Book> getbook() {
		// TODO Auto-generated method stub
		return BookList;
	}


	
}

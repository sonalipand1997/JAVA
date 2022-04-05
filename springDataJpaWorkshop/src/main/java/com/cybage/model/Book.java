package com.cybage.model;

public class Book {

	private int book_Id;
	private String book_name;
	private String Author;
	


	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Book(int book_Id, String book_name, String author) {
		super();
		this.book_Id = book_Id;
		this.book_name = book_name;
		Author = author;
	}


	public int getBook_Id() {
		return book_Id;
	}


	public void setBook_Id(int book_Id) {
		this.book_Id = book_Id;
	}


	public String getBook_name() {
		return book_name;
	}


	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}


	public String getAuthor() {
		return Author;
	}


	public void setAuthor(String author) {
		Author = author;
	}


	@Override
	public String toString() {
		return "Book [book_Id=" + book_Id + ", book_name=" + book_name + ", Author=" + Author + "]";
	}
	
	
	
	
	
}

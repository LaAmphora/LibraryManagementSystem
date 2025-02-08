package edu.mu.manage;

public class Book {
	
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	
	/**
	 * This is a default constructor, that will allow
	 * you to create a generic Book object.
	 * */
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		ISBN = "Unknown";
		this.price = 0.0;
	}
	
	/**
	 * This a parameterized constructor, that will allow you
	 * to create a Book object with a title, author, ISBN, and price.
	 * @param title (String)
	 * 		This argument is the the title of the book.
	 * @param author (String)
	 * 		This argument is the author of the book.
	 * @param ISBN (String)
	 * 		This argument is the ISBN of the book.
	 * @param price (double)
	 * 		This argument is the price of the book.
	 * */
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	/**
	 * This is a copy constructor, that will allow you to copy
	 * the members from a Book object to another book object.
	 * @param copy (Book)
	 * 		This argument is the Book object the user wants to copy.
	 * */
	public Book(Book copy) {
		this(copy.title, copy.author, copy.ISBN, copy.price);
	}
	
	
}

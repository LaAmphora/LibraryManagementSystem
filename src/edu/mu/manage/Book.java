package edu.mu.manage;

import java.util.Objects;

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

	/**
	 * Gets the title of a Book object.
	 * */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title of a Book object.
	 * */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the author of a Book object.
	 * */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the author of a Book object.
	 * */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Gets the ISBN of a Book object.
	 * */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * Sets the ISBN of a Book object.
	 * */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	/**
	 * Gets the price of a Book object.
	 * */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets the price of a Book object.
	 * */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Prints out all information associated with a Book object.
	 * */
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", price=" + price + "]";
	}
	
	@Override
	/**
	 * Checks if two book objects are equal
	 * @param obj
	 * 		This argument in a general object that will
	 * 		be cast to the object type we are testing is
	 * 		equal or not.
	 * @returns
	 * 		Returns a boolean true if two objects are equals.
	 * 		Returns a boolean false if two objects are not
	 * 		equal.
	 * */
	public boolean equals(Object obj) {
		Book book = (Book)obj;
		
		if(this.title.equals(book.getTitle()) &&
				this.author.equals(book.getAuthor()) &&
				this.ISBN.equals(book.getISBN()) &&
				this.price == book.getPrice()) {
			return true;
		}
		
		return false;
	}
	
	
	
}

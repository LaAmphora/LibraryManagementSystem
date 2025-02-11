package edu.mu.manage;

public class Library {
	
	private Book[] books;
	private int count;
	
	/**
	 * This is a default constructor that initializes
	 * the Book array with a fixed size of 5,
	 * and the count to zero.
	 */
	public Library() {
		this.books = new Book[5]; //creating a fixed size of 5
		this.count = 0;
	}
	
	/**
	 * This is a method used to add a book to the books array.
	 * If there is no more room in the array, the method
	 * displays an error message. Otherwise, the book is
	 * added and the count is incremented.
	 * 
	 * @param book
	 * 		This is the array of Books that is to be added to.
	 * @return
	 * 		Returns true if there is enough space in the array
	 * 		to add a book. Returns false if there is not enough
	 * 		space within the array.s
	 */
	public boolean addBook(Book book) {
		
		if (count < getBooks().length) {
			books[count] = book;
			count++;
			return true;
		} else {
			System.out.println("The library is full. You must remove a book before adding a new one.");
			return false;
		}
		
	}
	
	/**
	 * Getter for Book[] array.
	 * @return
	 * 		Returns the books array.
	 */
	public Book[] getBooks() {
		return books;
	}

	/**
	 * Setter for Book[] array.
	 * @param books
	 */
	public void setBooks(Book[] books) {
		this.books = books;
	}

	/**
	 * Getter for count variable.
	 * @return
	 */
	public int getCount() {
		return count;
	}

	/**
	 * Setter for count variable.
	 * @param count
	 */
	public void setCount(int count) {
		this.count = count;
	}

	
}

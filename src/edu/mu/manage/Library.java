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
	 * 		space within the arrays.
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
	 * This is a method used to remove a book from the books array.
	 * It finds the book within the array, moves the remaining books
	 * to the left, and assigns a null value.
	 * @param book
	 * 		This is the item that is to be removed from the books array.
	 * @return
	 * 		Returns true if remove was successful, false if not successful.
	 */
	public boolean removeBook(Book book) {
		
		for (int i = 0; i < count; i++) { //looping through books
			if (books[i].equals(book)) { //if we find the book in the array
				for (int j = i; j < count - 1; j++) { 
					books[j] = books[j + 1]; //move remaining books forward
				}
				books[count - 1] = null; //nullifying the last spot since it was moved forward
				count--;
				System.out.println("Book was removed.");
				return true;
			}
		}
		System.out.println("Cannot remove book "+ book.getTitle() +". It was not removed.");
		return false;
	}
	
	/**
	 * This is a method that searches the books array
	 * for a given ISBN. If found, the Book object is returned.
	 * Otherwise it returns null.
	 * @param ISBN
	 * 		The string variable used to search the books array.
	 * @return
	 * 		Returns the Book object if found, otherwise returns null.
	 */
	public Book searchByISBN(String ISBN) {
		
		for (int i = 0; i < count; i++) {
			if (books[i].getISBN() == ISBN) {
				return books[i];
			}
		}
		return null;
		
	}
	
	/**
	 * This is a method used to display all book information
	 * within the Books array. Uses the toString method of the
	 * Book class.
	 */
	public void displayBooks() {
		for (int i = 0; i < count; i++) {
			System.out.println((i+1) + ". " + books[i].toString());
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

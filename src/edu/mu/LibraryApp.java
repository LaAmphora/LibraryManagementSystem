package edu.mu;

import edu.mu.manage.Library;
import edu.mu.manage.Book;

public class LibraryApp {

	public static void main(String[] args) {
		
		Library kenziesLibrary = new Library(); //creating a library object
		
		Book siestaLane = new Book("Siesta Lane", "Amy Minato", "12345", 10.0);
		Book theHobbit = new Book("The Hobbit", "J.R.R Tolkien", "54321", 15.0);
		Book mathDestruction = new Book("Weapons of Math Destruction", "Cathy O'Neil", "32154", 20.0);
		
		//adding at least three books to the library
		kenziesLibrary.addBook(siestaLane);
		kenziesLibrary.addBook(theHobbit);
		kenziesLibrary.addBook(mathDestruction);
		
		//printing the library
		kenziesLibrary.displayBooks();
		
		//searching for book by ISBN, displays book object's information as result
		System.out.println("Found book with 54321 as ISBN: "+ kenziesLibrary.searchByISBN("54321").toString());
		
	}
	

}

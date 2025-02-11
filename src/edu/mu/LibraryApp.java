package edu.mu;

import edu.mu.manage.Library;
import edu.mu.manage.Book;

public class LibraryApp {

	public static void main(String[] args) {
		
		Library kenziesLibrary = new Library(); //creating a library object
		
		System.out.println("Adding books...\n");
		Book siestaLane = new Book("Siesta Lane", "Amy Minato", "12345", 10.0);
		Book theHobbit = new Book("The Hobbit", "J.R.R Tolkien", "54321", 15.0);
		Book mathDestruction = new Book("Weapons of Math Destruction", "Cathy O'Neil", "32154", 20.0);
		
		//adding at least three books to the library
		kenziesLibrary.addBook(siestaLane);
		kenziesLibrary.addBook(theHobbit);
		kenziesLibrary.addBook(mathDestruction);
		
		//searching for book by ISBN, displays book object's information as result
		System.out.println("Searching for book with ISBN: "+ siestaLane.getISBN());
		System.out.println("Book found: " + kenziesLibrary.searchByISBN(siestaLane.getISBN()));
		
		//printing the library
		System.out.println("\nAll books in the library:");
		kenziesLibrary.displayBooks();
		
		//removing existing book
		System.out.println("\nRemoving book: " + theHobbit.getTitle());
		kenziesLibrary.removeBook(theHobbit);
		
		//displaying all books
		System.out.println("\nAll books in the library:");
		kenziesLibrary.displayBooks();
		
		//removing non existing book, after we removed it
		System.out.println("\n");
		kenziesLibrary.removeBook(theHobbit);
		
	}
	

}

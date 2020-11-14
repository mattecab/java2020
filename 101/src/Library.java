import java.util.ArrayList;

public class Library {
	private ArrayList<Book> Book = new ArrayList<Book>();   //creates ArrayList
    Book newBook = new Book(title, publisher, year);   //instantiates Book class


	 public Library(ArrayList Book, Book newBook ){
		  this.Book=Book;
		  this.newBook=newBook;
	 }
public void addBook(Book newBook) {Book.add(newBook);}
public void printBooks() {System.out.println( Book );}
	
}

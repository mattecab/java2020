import java.util.ArrayList;

public class Author {
	protected String name; 
	protected String email;
	protected char gender;
	public static ArrayList<Book> books;
	

	 public Author(String name, String email, char gender) {
	 	this.name = name;
	 	this.email = email;
	 	this.gender = gender;
		this.books=new ArrayList<Book>();
	 }
	 
	 public void setName(String name) {
		this.name = name;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public String getName() {
	 	return this.name;
	 }
	 public String getEmail() {
	 	return this.email;
	 }
	 public void setEmail(String email) {
	 	this.email = email;
	 }
	 public char getGender() {
	 	return gender;
	 }
	 public String toString() {
		// to-do, print books as well
	 	String author = this.name + "(" + this.gender + ") at " + this.email;
	 	return author;
	 }
	 public void Add(Book book) {
		 books.add(book);
	 }
	 
}



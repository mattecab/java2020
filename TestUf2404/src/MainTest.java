

import java.util.ArrayList;
import java.util.Scanner;


	public class MainTest {

	public static void main(String[] args) {
				
	Scanner reader = new Scanner(System.in);
				
	    start(Author.books);
	    createBook(reader,Author.books);
	    //assign();
		//System.out.println(author1);
		//System.out.println(author2);
		//System.out.println(author3);
		// ….

				System.out.println("See you in the sky!");
			}	

			
public static void start(ArrayList<Book>books){
	Author author1=new Author("ONE", "YES", 'c');		
	Author author2=new Author("NOE ", "SI ", 'B');
	Author author3=new Author("LES ", "IE ", 'D');
  //assignar a l'ArrayList 3 Books y crear 3 books	
	Book book1=new Book(" ", 2, " ", 0);
	Book book2=new Book(" ", 2, " ", 0);
    Book book3 =new Book(" ", 2, " ", 0);
    author1.books.add(book1);
    author2.books.add(book2);
    author3.books.add(book3);
    book1.setAuthor(author1);
    book2.setAuthor(author2);
    book3.setAuthor(author3);
    System.out.println(author1.books.get(0));
    System.out.println(author1.books.get(1));
    System.out.println(author1.books.get(2));
		}

		public static void createBook(Scanner reader,ArrayList<Book>books){
		//preguntar los attributos de los 3 libres
                for (Book book : books) {
                	book.setAuthor(author2);
                System.out.println("insert data next Book");
				System.out.print("title :");
		    	book.setTitle(reader.nextLine());
		    	System.out.print("email :");
		    	author2.setEmail(reader.nextLine());
		    	//System.out.print("sex :");
		    	//book.setGender(reader.next().charAt(0));
		    	System.out.print("cost :");
		    	book.setCost(reader.nextInt());
		    	System.out.print("publisher :");
		    	book.setPublisher(reader.nextLine());
		    	System.out.print("year :");
		    	book.setYear(reader.nextInt());
		    	
				}
		    	


			}
	}




public class Main {

	public static void main(String[] args) {

/*Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007); 
System.out.println(cheese.title()); System.out.println(cheese.publisher()); System.out.println(cheese.year()); 
System.out.println(cheese); */
		Library Library = new Library(); 
		Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007); 
		Library.addBook(cheese); 
		Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
		Library.addBook(nhl); Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851)); 
		Library.printBooks(); 



	}

}

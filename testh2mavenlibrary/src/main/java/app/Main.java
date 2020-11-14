package app;


import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Reservas;
import model.User;
import model.Book;
import repository.BookRepository;
import repository.ReservasRepository;
import repository.UserRepository;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// Create our repositories ...
		BookRepository bookRepository = new BookRepository(entityManager);
		UserRepository userRepository = new UserRepository(entityManager);
		ReservasRepository reservasRepository = new ReservasRepository(entityManager);
		
		
		User luigi = new User ("matteo");
		Reservas first = new Reservas("first");
		Book primo = new Book("popart");
		
		Optional<Book> booksave  = bookRepository.save(primo);
		Optional<User> usersave = userRepository.save(luigi);
		Optional<Reservas> reservasave = reservasRepository.save(first);
		
		
		
		List<Book> book = bookRepository.findAll();
		System.out.println("Book:");
		for (Book bookToPrint : book) {
			System.out.println(bookToPrint);
		}
	
	 entityManager.close();
     entityManagerFactory.close();
	}
}

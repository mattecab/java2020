package app;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.List;
import java.util.Optional;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

import model.Book;
import model.Reservas;
import model.User;

import repository.BookRepository;
import repository.ReservasRepository;
import repository.UserRepository;

public class Main {
	// Create our entity manager
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	// Create our repositories ...
	BookRepository bookRepository = new BookRepository(entityManager);
	UserRepository userRepository = new UserRepository(entityManager);
	ReservasRepository reservasRepository = new ReservasRepository(entityManager);
	
	Book one = new Book("popart");
	User luigi = new User ( "luigi");
	Reservas first = new Reservas( "first");
	Optional<Book> booksave  = bookRepository.save(one);
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

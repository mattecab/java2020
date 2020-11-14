package repository;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;




public class BookRepository {
	private EntityManager entityManager;

	public BookRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
		
	}
	public Optional<Book> save(Book book) {
		Optional<Book> resultSave;
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(book);
			entityManager.getTransaction().commit();
			return resultSave = Optional.of(book);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultSave = Optional.empty();
		}
		public List<Book> findAll() {
			return entityManager.createQuery("from Book").getResultList();		}
}
package repository;

import java.awt.print.Book;
import java.util.Optional;

import javax.persistence.EntityManager;

import model.Reservas;

public class ReservasRepository {

		private EntityManager entityManager;

		public ReservasRepository(EntityManager entityManager) {
			this.entityManager = entityManager;
		}
public Optional<Reservas> save(Reservas reservas) {
	Optional<Reservas> resultSave;
	try {
		entityManager.getTransaction().begin();
		entityManager.persist(reservas);
		entityManager.getTransaction().commit();
		return resultSave = Optional.of(reservas);

	} catch (Exception e) {
		e.printStackTrace();
	}
	return resultSave = Optional.empty();
}}
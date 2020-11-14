package repository;

import java.util.Optional;

import javax.persistence.EntityManager;

import model.User;






public class UserRepository {
	private EntityManager entityManager;

	public UserRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	public Optional<User> save(User user) {
		Optional<User> resultSave;
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(user);
			entityManager.getTransaction().commit();
			return resultSave = Optional.of(user);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultSave = Optional.empty();
}}

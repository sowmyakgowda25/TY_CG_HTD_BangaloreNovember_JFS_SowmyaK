package com.capgemini.flightmanagementsys.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.capgemini.flightmanagementsys.dto.User;
import com.capgemini.flightmanagementsys.exception.UserException;

@Repository
public class UserDAOImpl implements UserDAO{
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public boolean addUser(User user) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			entityManager.persist(user);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			throw new UserException("Id already exist");
		}
		entityManager.close();
		return true;
	}

	@Override
	public boolean modifyUser(int userId, String userName, String userPassword, long userPhone, String userEmail) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			User details = entityManager.find(User.class, userId);
			details.setUserId(userId);
			details.setUserName(userName);
			details.setUserPassword(userPassword);
			details.setUserPhone(userPhone);
			details.setUserEmail(userEmail);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			throw new UserException("Id doesn't exist");
		}
	}

	@Override
	public User searchUser(int userId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		User bean = entityManager.find(User.class, userId);
		return bean;
	}

	@Override
	public boolean deleteUser(int userId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			User details = entityManager.find(User.class, userId);
			entityManager.remove(details);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			throw new UserException("Id doesn't exist");
		}
	}

	@Override
	public List<User> getAllUser() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			String jpql = "from User";
			Query query = entityManager.createQuery(jpql);
			@SuppressWarnings("unchecked")
			List<User> details = query.getResultList();
			return details;
		} catch (Exception e) {
			transaction.rollback();
			throw new UserException("No Data Found");
		}
	}

	@Override
	public User adminLogin(User credentials) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from User where userName=:name";
		TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
		query.setParameter("name", credentials.getUserName());
		try {
			User account = query.getSingleResult();
			if (account.getUserPassword().equals(credentials.getUserPassword())) {
				return account;
			} else {
				System.out.println("here above valid");
				return null;
			}
		} catch (Exception e) {
			throw new UserException("Account does not exist");
		}
	}

}

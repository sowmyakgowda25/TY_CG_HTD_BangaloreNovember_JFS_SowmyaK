package com.capgemini.testspringboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.testspringboot.dto.UserInfo;
import com.capgemini.testspringboot.exception.ProductInfoException;

@Repository
public class UserInfoDaoImpl implements UserInfoDao{
	
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public boolean addUser(UserInfo user) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public UserInfo login(UserInfo credentials) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from UserInfo where email=:email";
		TypedQuery<UserInfo> query = manager.createQuery(jpql, UserInfo.class);
		query.setParameter("email", credentials.getEmail());
		try {
			UserInfo info = query.getSingleResult();
			if (info.getPassword().equals(credentials.getPassword())) {
				return info;
			} else {
				System.out.println("here above valid");
				return null;
			}
		} catch (Exception e) {
			throw new ProductInfoException("Account does not exist");
		}
	}

	@Override
	public boolean updatePassword(int id, String password) {
		
		EntityManager manager = factory.createEntityManager();
		UserInfo info = manager.find(UserInfo.class, id);
		EntityTransaction transaction = manager.getTransaction();
		if (info != null) {
			transaction.begin();
			info.setPassword(password);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}

}
package com.capgemini.fms_jpahibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.fms_jpahibernate.dto.ContractBean;
import com.capgemini.fms_jpahibernate.exception.FmsException;

public class ContractDaoImpl implements ContractDao {

	EntityManager entityManager = null;
	EntityTransaction transaction = null;
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("fms");

	public boolean addContractor(ContractBean bean) throws FmsException {

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("fms");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(bean);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			throw new FmsException("Contract Number already exist");
		}
		// transaction.commit();
		entityManager.close();
		return true;
	}

	public boolean deleteContractor(int contractNo) throws FmsException {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			ContractBean record = entityManager.find(ContractBean.class, contractNo);
			entityManager.remove(record);
			System.out.println("record deleted");
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			throw new FmsException("Contract number does not exist");
		}
//		entityManager.close();
//		return false;
	}

	public List<ContractBean> getAllContractor(ContractBean bean) {
		try {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			// entityManager=entityManagerFactory.createEntityManager();
			String jpql = "from ContractBean";
			Query query = entityManager.createQuery(jpql);
			@SuppressWarnings("unchecked")
			List<ContractBean> record = query.getResultList();
			return record;
		} catch (Exception e) {
			System.out.println("No data present");
			transaction.rollback();
		}
		entityManager.close();
		return null;
	}
}
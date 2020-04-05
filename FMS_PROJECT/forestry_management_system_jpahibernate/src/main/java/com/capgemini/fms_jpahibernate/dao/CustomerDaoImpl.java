package com.capgemini.fms_jpahibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.fms_jpahibernate.dto.CustomerBean;
import com.capgemini.fms_jpahibernate.exception.FmsException;

public class CustomerDaoImpl implements CustomerDao{

	EntityManager entityManager=null;
	EntityTransaction transaction=null;
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("fms");

	public boolean addCustomer(CustomerBean bean) throws FmsException {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(bean);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			throw new FmsException("Id already exist");
			
		}
		//transaction.commit();
		entityManager.close();
		return true;
	}

	public boolean modifyCustomerName(int custId, String custName) throws FmsException {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			CustomerBean record = entityManager.find(CustomerBean.class, custId);
			//entityManager.remove(record);
			record.setCustId(custId);
			record.setCustName(custName);
			transaction.commit();
			return true;
		}catch(Exception e) {
			transaction.rollback();
			throw new FmsException("Id doesn't exist");
		}
//		entityManager.close();
//		return false;
	}


	public boolean modifyCustomerAddress1(int custId, String streetAddress1) throws FmsException {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			CustomerBean record = entityManager.find(CustomerBean.class, custId);
			//entityManager.remove(record);
			record.setCustId(custId);
			record.setStreetAddress1(streetAddress1);
			transaction.commit();
			return true;
		}catch(Exception e) {
			transaction.rollback();
			throw new FmsException("Id doesn't exist");
		}
//		entityManager.close();
//		return false;
	}


	public boolean modifyCustomerAddress2(int custId, String streetAddress2) throws FmsException {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			CustomerBean record = entityManager.find(CustomerBean.class, custId);
			//entityManager.remove(record);
			record.setCustId(custId);
			record.setStreetAddress2(streetAddress2);
			transaction.commit();
			return true;
		}catch(Exception e) {
			transaction.rollback();
			throw new FmsException("Id doesn't exist");
		}
//		entityManager.close();
//		return false;
	}


	public boolean modifyCustomerTown(int custId, String town) throws FmsException {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			CustomerBean record = entityManager.find(CustomerBean.class, custId);
			//entityManager.remove(record);
			record.setCustId(custId);
			record.setTown(town);
			transaction.commit();
			return true;
		}catch(Exception e) {
			transaction.rollback();
			throw new FmsException("Id doesn't exist");
		}
//		entityManager.close();
//		return false;
	}


	public boolean modifyCustomerEmail(int custId, String email) throws FmsException {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			CustomerBean record = entityManager.find(CustomerBean.class, custId);
			//entityManager.remove(record);
			record.setCustId(custId);
			record.setEmail(email);
			transaction.commit();
			return true;
		}catch(Exception e) {
			transaction.rollback();
			throw new FmsException("Id doesn't exist");
		}
//		entityManager.close();
//		return false;
	}

	public boolean modifyCustomerPostalCode(int custId, int postalCode) throws FmsException {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			CustomerBean record = entityManager.find(CustomerBean.class, custId);
			//entityManager.remove(record);
			record.setCustId(custId);
			record.setPostalCode(postalCode);
			transaction.commit();
			return true;
		}catch(Exception e) {
			transaction.rollback();
			throw new FmsException("Id doesn't exist");
		}
//		entityManager.close();
//		return false;
	}

	public boolean modifyCustomerTelePhoneNum(int custId, long number) throws FmsException {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			CustomerBean record = entityManager.find(CustomerBean.class, custId);
			//entityManager.remove(record);
			record.setCustId(custId);
			record.setTelephoneNumber(number);
			transaction.commit();
			return true;
		}catch(Exception e) {
			transaction.rollback();
			throw new FmsException("Id doesn't exist");
		}
//		entityManager.close();
//		return false;
	}

	public boolean deleteCustomer(int custId) throws FmsException {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			CustomerBean record = entityManager.find(CustomerBean.class, custId);
			entityManager.remove(record);
			transaction.commit();
			return true;
		}catch(Exception e) {
			transaction.rollback();
			throw new FmsException("Id doesn't exist");
		}
//		entityManager.close();
//		return false;
	}
	public List<CustomerBean> getAllCustomers(CustomerBean bean) {
		try {
			EntityManager entityManager= entityManagerFactory.createEntityManager();
			//entityManager=entityManagerFactory.createEntityManager();
			String jpql="from CustomerBean";
			Query query = entityManager.createQuery(jpql);
			@SuppressWarnings("unchecked")
			List<CustomerBean> record=query.getResultList();
			return record;
		}catch(Exception e) {
			//e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
		return null;
	}

}
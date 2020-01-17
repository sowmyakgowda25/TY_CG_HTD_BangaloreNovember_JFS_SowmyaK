package com.capgemini.fms_springboot.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.fms_springboot.dto.CustomerBean;
import com.capgemini.fms_springboot.exception.CustomerException;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	EntityManager entityManager = null;
	EntityTransaction transaction = null;

	public boolean addCustomer(CustomerBean bean) {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(bean);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			throw new CustomerException("Id already exist");

		}
		// transaction.commit();
		entityManager.close();
		return true;
	}

	public boolean modifyCustomerName(int custId, String custName) {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			CustomerBean record = entityManager.find(CustomerBean.class, custId);
			// entityManager.remove(record);
			record.setCustId(custId);
			record.setCustName(custName);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			throw new CustomerException("Id doesn't exist");
		}
//		entityManager.close();
//		return false;
	}

	public boolean modifyCustomerAddress1(int custId, String streetAddress1) {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			CustomerBean record = entityManager.find(CustomerBean.class, custId);
			// entityManager.remove(record);
			record.setCustId(custId);
			record.setStreetAddress1(streetAddress1);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			throw new CustomerException("Id doesn't exist");
		}
//		entityManager.close();
//		return false;
	}

	public boolean modifyCustomerAddress2(int custId, String streetAddress2) {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			CustomerBean record = entityManager.find(CustomerBean.class, custId);
			// entityManager.remove(record);
			record.setCustId(custId);
			record.setStreetAddress2(streetAddress2);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			throw new CustomerException("Id doesn't exist");
		}
//		entityManager.close();
//		return false;
	}

	public boolean modifyCustomerTown(int custId, String town) {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			CustomerBean record = entityManager.find(CustomerBean.class, custId);
			// entityManager.remove(record);
			record.setCustId(custId);
			record.setTown(town);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			throw new CustomerException("Id doesn't exist");
		}
//		entityManager.close();
//		return false;
	}

	public boolean modifyCustomerEmail(int custId, String email) {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			CustomerBean record = entityManager.find(CustomerBean.class, custId);
			// entityManager.remove(record);
			record.setCustId(custId);
			record.setEmail(email);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			throw new CustomerException("Id doesn't exist");
		}
//		entityManager.close();
//		return false;
	}

	public boolean modifyCustomerPostalCode(int custId, int postalCode) {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			CustomerBean record = entityManager.find(CustomerBean.class, custId);
			// entityManager.remove(record);
			record.setCustId(custId);
			record.setPostalCode(postalCode);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			throw new CustomerException("Id doesn't exist");
		}
//		entityManager.close();
//		return false;
	}

	public boolean modifyCustomerTelePhoneNum(int custId, long number) {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			CustomerBean record = entityManager.find(CustomerBean.class, custId);
			// entityManager.remove(record);
			record.setCustId(custId);
			record.setTelephoneNumber(number);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			throw new CustomerException("Id doesn't exist");
		}
//		entityManager.close();
//		return false;
	}

	public boolean deleteCustomer(int custId) {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			CustomerBean record = entityManager.find(CustomerBean.class, custId);
			entityManager.remove(record);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			throw new CustomerException("Id doesn't exist");
		}
//		entityManager.close();
//		return false;
	}

	public List<CustomerBean> getAllCustomer() {
		try {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			// entityManager=entityManagerFactory.createEntityManager();
			String jpql = "from CustomerBean";
			Query query = entityManager.createQuery(jpql);
			@SuppressWarnings("unchecked")
			List<CustomerBean> record = query.getResultList();
			return record;
		} catch (Exception e) {
			transaction.rollback();
			throw new CustomerException("No Data Found");
		}
//		entityManager.close();
//		return null;
	}
}
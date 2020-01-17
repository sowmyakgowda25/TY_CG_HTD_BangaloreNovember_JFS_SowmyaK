package com.capgemini.fms_jpahibernate.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.capgemini.fms_jpahibernate.dto.ProductBean;
import com.capgemini.fms_jpahibernate.exception.FmsException;

public class ProductDaoImpl implements ProductDao{

	EntityManager entityManager=null;
	EntityTransaction transaction=null;
	EntityManagerFactory entityManagerFactory=null;

	public boolean addProduct(ProductBean bean) throws FmsException {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("fms");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(bean);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			throw new FmsException("Id already exist");
		}
		entityManager.close();
		return true;
	}

	public boolean deleteProduct(int productId) throws FmsException {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("fms");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			ProductBean record = entityManager.find(ProductBean.class, productId);
			entityManager.remove(record);
			transaction.commit();
			return true;
		}catch(Exception e) {
			transaction.rollback();
			throw new FmsException("Id not exist");
		}
//		return false;
//		entityManager.close();
	}


	public boolean modifyProduct(int productId , String productName) throws FmsException {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("fms");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			ProductBean record = entityManager.find(ProductBean.class, productId);
			//entityManager.remove(record);
			record.setProductName(productName);
			
			transaction.commit();
			return true;
		}catch(Exception e) {
			transaction.rollback();
			throw new FmsException("Id not exist");
		}
//		entityManager.close();
//		return false;
	}

	public List<ProductBean> getAllProduct(ProductBean bean) {
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("fms");
			EntityManager entityManager= entityManagerFactory.createEntityManager();
			//entityManager=entityManagerFactory.createEntityManager();
			String jpql="from ProductBean";
			Query query = entityManager.createQuery(jpql);
			@SuppressWarnings("unchecked")
			List<ProductBean> record=query.getResultList();
			return record;
		}catch(Exception e) {
			//e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
		return null;
	}
}
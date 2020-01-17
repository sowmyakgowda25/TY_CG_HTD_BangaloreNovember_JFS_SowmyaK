package com.capgemini.fms_springboot.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.fms_springboot.dto.ProductBean;
import com.capgemini.fms_springboot.exception.ProductException;

@Repository
public class ProductDaoImpl implements ProductDao {

	@PersistenceUnit
	EntityManagerFactory entityManagerFactory;
	EntityManager entityManager = null;
	EntityTransaction transaction = null;

	public boolean addProduct(ProductBean bean) {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(bean);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			throw new ProductException("Id already exist");
		}
		entityManager.close();
		return true;
	}

	public boolean deleteProduct(int productId) {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			ProductBean record = entityManager.find(ProductBean.class, productId);
			entityManager.remove(record);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			throw new ProductException("Id not exist");
		}
//		return false;
		//entityManager.close();
	}

	public boolean modifyProduct(int productId, String productName)  {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			ProductBean record = entityManager.find(ProductBean.class, productId);
			// entityManager.remove(record);
			record.setProductName(productName);

			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			throw new ProductException("Id not exist");
		}
//		entityManager.close();
//	return false;
	}

	public List<ProductBean> getAllProduct() {
		try {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			String jpql = "from ProductBean";
			Query query = entityManager.createQuery(jpql);
			@SuppressWarnings("unchecked")
			List<ProductBean> record = query.getResultList();
			return record;
		} catch (Exception e) {
			transaction.rollback();
			throw new ProductException("No Data Found");
		}
//		entityManager.close();
//		return null;
	}

}
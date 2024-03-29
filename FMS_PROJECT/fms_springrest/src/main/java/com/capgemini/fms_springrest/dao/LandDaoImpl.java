package com.capgemini.fms_springrest.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.fms_springrest.dto.LandBean;
import com.capgemini.fms_springrest.exception.LandException;

@Repository
public class LandDaoImpl implements LandDao{
	
	@PersistenceUnit
	EntityManagerFactory entityManagerFactory;
	EntityManager entityManager=null;
	EntityTransaction transaction=null;

	public boolean addLand(LandBean bean) {

		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(bean);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			throw new LandException("Id already exist");
		}
		entityManager.close();
		return true;
	}

	public boolean deleteLand(int landId) {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			LandBean record = entityManager.find(LandBean.class, landId);
			entityManager.remove(record);
			transaction.commit();
			return true;
		}catch(Exception e) {
			transaction.rollback();
			throw new LandException("Id doesn't exist");
		}
//		entityManager.close();
//		return false;
	}

	public List<LandBean> getAllLand(LandBean bean) {
		try {
			EntityManager entityManager= entityManagerFactory.createEntityManager();
			String jpql="from LandBean";
			Query query = entityManager.createQuery(jpql);
			@SuppressWarnings("unchecked")
			List<LandBean> record = query.getResultList();
			return record;
		}catch(Exception e) {
			transaction.rollback();
			throw new LandException("No Data Found");
		}
//		entityManager.close();
//		return null;
	}

	public boolean modifyLandLoc(int landId, String landLocation) {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			LandBean record = entityManager.find(LandBean.class, landId);
			//entityManager.remove(record);
			record.setLandId(landId);
			record.setLandLocation(landLocation);
			transaction.commit();
			return true;
		}catch(Exception e) {
			transaction.rollback();
			throw new LandException("Id doesn't exist");
		}
//		entityManager.close();
//		return false;
	}

	public boolean modifyLandAcre(int landId, double landAcre) {
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			LandBean record = entityManager.find(LandBean.class, landId);
			//entityManager.remove(record);
			record.setLandId(landId);
			record.setLandAcre(landAcre);
			transaction.commit();
			return true;
		}catch(Exception e) {
			transaction.rollback();
			throw new LandException("Id doesn't exist");
		}
//		entityManager.close();
//		return false;
	}
}

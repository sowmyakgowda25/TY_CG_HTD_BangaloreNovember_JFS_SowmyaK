package com.capgemini.fms_collection.service;

import java.util.List;

import com.capgemini.fms_collection.bean.OrderBean;
import com.capgemini.fms_collection.dao.OrderDao;
import com.capgemini.fms_collection.exception.FmsException;
import com.capgemini.fms_collection.factory.OrderFactory;

public class OrderServicesImpl implements OrderServices{
	
	OrderDao dao =  OrderFactory.instanceOfOrderDAOImpl();
	
	@Override
	public boolean addOrder(OrderBean bean) throws FmsException {
		return dao.addOrder(bean);
	}

	@Override
	public boolean modifyCustomerName(int orderNo, String customerName) throws FmsException {
		return dao.modifyCustomerName(orderNo, customerName);
	}

	@Override
	public boolean modifyProductName(int orderNo, String productName) throws FmsException {
		return dao.modifyProductName(orderNo, productName);
	}

	@Override
	public boolean modifyOrderQuantity(int orderNo, int quantity) throws FmsException {
		return dao.modifyOrderQuantity(orderNo, quantity);
	}

	@Override
	public boolean modifyDeliverDate(int orderNo, String deliveryDate) throws FmsException {
		return dao.modifyDeliverDate(orderNo, deliveryDate);
	}

	@Override
	public boolean modifyHaulierName(int orderNo, String haulierName) throws FmsException {
		return dao.modifyHaulierName(orderNo, haulierName);
	}

	@Override
	public boolean deleteOrder(int orderNo) throws FmsException {
		return dao.deleteOrder(orderNo);
	}

	@Override
	public List<OrderBean> getAllOrders() {
		return dao.getAllOrders();
	}
	
}

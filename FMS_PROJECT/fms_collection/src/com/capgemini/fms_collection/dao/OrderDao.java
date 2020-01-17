package com.capgemini.fms_collection.dao;

import java.util.List;

import com.capgemini.fms_collection.bean.OrderBean;
import com.capgemini.fms_collection.exception.FmsException;

public interface OrderDao {
	
	boolean addOrder(OrderBean bean) throws FmsException;

	boolean modifyCustomerName(int orderNo, String customerName) throws FmsException;

	boolean modifyProductName(int orderNo, String productName) throws FmsException;

	boolean modifyOrderQuantity(int orderNo, int quantity) throws FmsException;

	boolean modifyDeliverDate(int orderNo, String deliveryDate) throws FmsException;
	
	boolean modifyHaulierName(int orderNo, String haulierName) throws FmsException;
	
	boolean deleteOrder(int orderNo) throws FmsException;

	public List<OrderBean> getAllOrders();
}

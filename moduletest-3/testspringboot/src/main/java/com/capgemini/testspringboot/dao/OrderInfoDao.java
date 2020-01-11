package com.capgemini.testspringboot.dao;

import java.util.List;

import com.capgemini.testspringboot.dto.OrderInfo;

public interface OrderInfoDao {
	
	public boolean addOrderToCart(OrderInfo order);
		
	public List<OrderInfo> getAllOrders();
}

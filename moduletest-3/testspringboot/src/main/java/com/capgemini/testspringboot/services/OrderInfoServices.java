package com.capgemini.testspringboot.services;

import java.util.List;

import com.capgemini.testspringboot.dto.OrderInfo;

public interface OrderInfoServices {
	
	public boolean addOrderToCart(OrderInfo order);
	
	public List<OrderInfo> getAllOrders();
}

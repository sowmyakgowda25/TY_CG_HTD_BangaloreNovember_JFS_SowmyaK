package com.capgemini.testspringboot.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.testspringboot.dao.OrderInfoDao;
import com.capgemini.testspringboot.dto.OrderInfo;

@Service
public class OrderInfoServicesImpl implements OrderInfoServices {

	@Autowired
	private OrderInfoDao dao;

	@Override
	public boolean addOrderToCart(OrderInfo order) {
		return dao.addOrderToCart(order);
	}

	@Override
	public List<OrderInfo> getAllOrders() {
		return dao.getAllOrders();
	}

}

package com.example.order.service;

import java.util.List;

import com.example.order.entity.Order;

public interface OrderService {
	List<Order> findAll();
	Order findById(int id);
	void save(Order payment);
	void deleteById(int id);
	
}

package com.example.order.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.order.entity.Order;
import com.example.order.service.OrderService;

public class OrderController {

@Autowired
OrderService orderservice;

@GetMapping ("/order")
List<Order> findAll() {
	return orderservice.findAll();
}

@GetMapping ("/order/{id}")
Order findById(@PathVariable int id) {
	return orderservice.findById(id);
}
@PostMapping ("/order")
void save(@RequestBody Order payment) {
	orderservice.save(payment);
} 
@DeleteMapping ("/order/{id}")
void deleteById(@PathVariable int id) {
	 orderservice.deleteById(id);
}
}

package com.usecase.Payment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usecase.Payment.entity.Payment;
import com.usecase.Payment.service.PaymentService;

@RestController
public class PaymentController {
	
	@Autowired
	PaymentService paymentservice;
	
	@GetMapping ("/pay")
	List<Payment> findAll() {
		return paymentservice.findAll();
	}
	
	@GetMapping ("/pay/{id}")
	Payment findById(@PathVariable int id) {
		return paymentservice.findById(id);
	}
	@PostMapping ("/pay")
	void save(@RequestBody Payment payment) {
	     paymentservice.save(payment);
	} 
	@DeleteMapping ("/pay/{id}")
	void deleteById(@PathVariable int id) {
		 paymentservice.deleteById(id);
	}

}


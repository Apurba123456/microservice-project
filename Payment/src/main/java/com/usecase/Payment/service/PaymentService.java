package com.usecase.Payment.service;

import java.util.List;

import com.usecase.Payment.entity.Payment;

public interface PaymentService {
	
	List<Payment> findAll();
	Payment findById(int id);
	void save(Payment payment);
	void deleteById(int id);
	
}

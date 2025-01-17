package com.usecase.Payment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usecase.Payment.entity.Payment;
import com.usecase.Payment.repository.PaymentRepo;
import com.usecase.Payment.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	PaymentRepo paymentrepo;
	
	@Override
	public List<Payment> findAll() {
		return paymentrepo.findAll();
	}
	@Override
	public Payment findById(int id) {
		return paymentrepo.findById(id).get();
	}
	@Override
	public void save(Payment payment) {
		paymentrepo.save(payment);

	}
	@Override
	public void deleteById(int id) {
		paymentrepo.deleteById(id);

	}
}

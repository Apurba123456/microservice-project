package com.example.order.service.Impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.order.Repo.OrderRepo;
import com.example.order.entity.Order;
import com.example.order.service.OrderService;
import com.example.order.service.PaymentDTO.PaymentDTO;
@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderRepo orderrepo;
	
	RestTemplate restTemplate = new RestTemplate();
	
	@Override
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return orderrepo.findAll();
	}

	@Override
	public Order findById(int id) {
		// TODO Auto-generated method stub
		return orderrepo.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		orderrepo.deleteById(id);
	}

	@Override
	public void save(Order order) {
		// TODO Auto-generated method stub
		String URL = "http://localhost:9090/pay";
		
		orderrepo.save(order);
		order.setOrderDate(LocalDate.now());;
		//order.setOrderStatus("Initiated");
		PaymentDTO paymentDTO = new PaymentDTO(order.getId(),order.getTotalamount());
		ResponseEntity<PaymentDTO> resp = restTemplate.postForEntity(URL, paymentDTO, PaymentDTO.class);
		if(resp.getStatusCode()==HttpStatus.OK)
		{
			order.setOrderstatus("Paid");
			orderrepo.save(order);
		}
	}
}

package com.usecase.Payment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payment")
public class Payment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@Column(name="order_id")
	String orderid;
	
	@Column(name="total_amount")
	double totalamount;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(int id, String orderid, double totalamount) {
		super();
		this.id = id;
		this.orderid = orderid;
		this.totalamount = totalamount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public double getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(double totalamount) {
		this.totalamount = totalamount;
	}
	
	@Override
	public String toString() {
		return "Payment [id=" + id + ", orderid=" + orderid + ", totalamount=" + totalamount + "]";
	}
}

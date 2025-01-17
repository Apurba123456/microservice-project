package com.example.order.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Order_details")
public class Order {
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		int id;
		
		@Column(name="order_status")
		String orderstatus;
		
		@Column(name="total_amount")
		double totalamount;
		
		@Column(name="order_date")
		LocalDate orderDate;
		
		public Order() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Order(int id, String orderstatus, double totalamount, LocalDate orderDate) {
			super();
			this.id = id;
			this.orderstatus = orderstatus;
			this.totalamount = totalamount;
			this.orderDate = orderDate;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getOrderstatus() {
			return orderstatus;
		}

		public void setOrderstatus(String orderstatus) {
			this.orderstatus = orderstatus;
		}

		public double getTotalamount() {
			return totalamount;
		}

		public void setTotalamount(double totalamount) {
			this.totalamount = totalamount;
		}

		public LocalDate getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(LocalDate orderDate) {
			this.orderDate = orderDate;
		}

		@Override
		public String toString() {
			return "Order [id=" + id + ", orderstatus=" + orderstatus + ", totalamount=" + totalamount + ", orderDate="
					+ orderDate + "]";
		}

}

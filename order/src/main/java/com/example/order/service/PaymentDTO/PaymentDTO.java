package com.example.order.service.PaymentDTO;

public class PaymentDTO {
    int id;
    int orderid;
    double totalprice;
	public PaymentDTO(int orderid, double totalprice) {
		super();
		this.orderid = orderid;
		this.totalprice = totalprice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	@Override
	public String toString() {
		return "PaymentDTO [id=" + id + ", orderid=" + orderid + ", totalprice=" + totalprice + "]";
	}
	public PaymentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
}

package com.example.onlinePizza.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;

@Entity
@Table(name="Pizza_Order")
public class PizzaOrder 
{	
	public Pizza getPizza() {
		return pizza;
	}
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Coupan getCoupan() {
		return coupan;
	}
	public void setCoupan(Coupan coupan) {
		this.coupan = coupan;
	}
	@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int bookingOrderId;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate orderDateL;
	
	private String transactionMode;
	
	private int quantity;
	
	private String sizes;
	
	private double totalCosts;
	
	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(referencedColumnName = "pizzaId")
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pizzaId")
	@JsonIncludeProperties(value="pizzaId")
	
	private Pizza pizza;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "orderId")
	@JsonIncludeProperties(value="orderId")
	
	private Order order;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "coupanId")
	@JsonIncludeProperties(value="coupanId")
	private Coupan coupan;
	
	public int getBookingOrderId() {
		return bookingOrderId;
	}
	public void setBookingOrderId(int bookingOrderId) {
		this.bookingOrderId = bookingOrderId;
	}
	public LocalDate getOrderDateL() {
		return orderDateL;
	}
	public void setOrderDateL(LocalDate orderDateL) {
		this.orderDateL = orderDateL;
	}
	public String getTransactionMode() {
		return transactionMode;
	}
	public void setTransactionMode(String transactionMode) {
		this.transactionMode = transactionMode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getSizes() {
		return sizes;
	}
	public void setSizes(String sizes) {
		this.sizes = sizes;
	}
	public double getTotalCosts() {
		return totalCosts;
	}
	public void setTotalCosts(double totalCosts) {
		this.totalCosts = totalCosts;
	}	
}
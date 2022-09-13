package com.example.onlinePizza.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="pizza")
public class Pizza {
	@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long pizzaId;
	private String pizzaType;
	private String pizzaName;
	private String pizzaDescription;
	private double pizzaCost;
	private double pizzaCostAfterCoupan;
	
	@OneToOne(mappedBy = "pizza",  orphanRemoval = true, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "bookingOrderId")
	@JsonIgnore
	private PizzaOrder  pizzaOrder ;
	
	
	public long getPizzaId() {
		return pizzaId;
	}
	public void setPizzaId(long pizzaId) {
		this.pizzaId = pizzaId;
	}
	public String getPizzaType() {
		return pizzaType;
	}
	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}
	public String getPizzaName() {
		return pizzaName;
	}
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public String getPizzaDescription() {
		return pizzaDescription;
	}
	public void setPizzaDescription(String pizzaDescription) {
		this.pizzaDescription = pizzaDescription;
	}
	public double getPizzaCost() {
		return pizzaCost;
	}
	public void setPizzaCost(double pizzaCost) {
		this.pizzaCost = pizzaCost;
	}
	public double getPizzaCostAfterCoupan() {
		return pizzaCostAfterCoupan;
	}
	public void setPizzaCostAfterCoupan(double pizzaCostAfterCoupan) {
		this.pizzaCostAfterCoupan = pizzaCostAfterCoupan;
	}

	
}

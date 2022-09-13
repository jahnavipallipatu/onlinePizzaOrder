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
@Table(name="coupan")

public class Coupan {
	 @Id
	  @GeneratedValue(strategy = GenerationType.SEQUENCE)


	private long coupanId;
	private String coupanName;
	private String coupanType;
	private String coupanDescription;
	private int coupanPizzaId;

	@OneToOne(mappedBy = "coupan",  orphanRemoval = true, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "bookingOrderId")
	@JsonIgnore
	private PizzaOrder  pizzaOrder ;
	

	public long getCoupanId() {
		return coupanId;
	}

	public void setCoupanId(long coupanId) {
		this.coupanId = coupanId;
	}

	public String getCoupanName() {
		return coupanName;
	}

	public void setCoupanName(String coupanName) {
		this.coupanName = coupanName;
	}

	public String getCoupanType() {
		return coupanType;
	}

	public void setCoupanType(String coupanType) {
		this.coupanType = coupanType;
	}

	public String getCoupanDescription() {
		return coupanDescription;
	}

	public void setCoupanDescription(String coupanDescription) {
		this.coupanDescription = coupanDescription;
	}

	public int getCoupanPizzaId() {
		return coupanPizzaId;
	}

	public void setCoupanPizzaId(int coupanPizzaId) {
		this.coupanPizzaId = coupanPizzaId;
	}

}

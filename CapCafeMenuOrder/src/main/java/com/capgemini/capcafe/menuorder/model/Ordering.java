package com.capgemini.capcafe.menuorder.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table
public class Ordering {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="orderId") 
	private int orderId;
	
	@Column(name="foodNaming")
	private String foodNaming;
	
	@Column(name="foodPricing")
	private int foodPricing;
	
	@Column(name="foodQuantity")
	private int foodQuantity;

	public Ordering(int orderId, String foodName, int foodPrice, int foodQuantity) {
		super();
		this.orderId = orderId;
		this.foodNaming = foodName;
		this.foodPricing = foodPrice;
		this.foodQuantity = foodQuantity;
	}


	public Ordering() {
		
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public String getFoodName() {
		return foodNaming;
	}


	public void setFoodName(String foodName) {
		this.foodNaming = foodName;
	}


	public int getFoodPrice() {
		return foodPricing;
	}


	public void setFoodPrice(int foodPrice) {
		this.foodPricing = foodPrice;
	}


	public int getFoodQuantity() {
		return foodQuantity;
	}


	public void setFoodQuantity(int foodQuantity) {
		this.foodQuantity = foodQuantity;
	}
	
	

}

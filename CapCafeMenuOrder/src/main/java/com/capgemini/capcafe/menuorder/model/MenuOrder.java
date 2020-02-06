package com.capgemini.capcafe.menuorder.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class MenuOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FoodID")
	private String foodId;
	
	@Column(name = "CafeID")
	private String cafeId;
	
	@Column(name = "Food_Name")
	private String foodName;
	
	@Column(name = "Food_Price")
	private int foodPrice;

	public String getFoodId() {
		return foodId;
	}
	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}
	public String getCafeId() {
		return cafeId;
	}
	public void setCafeId(String cafeId) {
		this.cafeId = cafeId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	public MenuOrder(String foodId, String cafeId, String foodName, int foodPrice) {
		super();
		this.foodId = foodId;
		this.cafeId = cafeId;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}

	public MenuOrder() {
		
	}
	
}

package com.capgemini.capcafe.menuorder.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity

public class MenuOrder {
	@Id
	@JsonProperty("FoodID")
	private String foodId;
	
	@JsonProperty("CafeID")
	private String cafeId;
	
	@JsonProperty("Food_Name")
	private String foodName;
	
	@JsonProperty("Food_Price")
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

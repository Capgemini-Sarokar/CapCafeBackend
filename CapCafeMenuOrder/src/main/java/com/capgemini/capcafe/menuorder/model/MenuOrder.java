package com.capgemini.capcafe.menuorder.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table
public class MenuOrder {

	@Id
	@JsonProperty("foodId")
	private String foodId;
	
	@JsonProperty("cafeId")
	private String cafeId;
	
	@JsonProperty("foodName")
	private String foodName;
	
	@JsonProperty("foodPrice")
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

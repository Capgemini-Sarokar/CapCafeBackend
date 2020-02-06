package com.capgemini.capcafe.helpdesk.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orders")
public class Orders{
	
	@Id
	private int orderId;
	
	public Orders(int orderId) {
		super();
		this.orderId = orderId;
		
	}



	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
}

	
	

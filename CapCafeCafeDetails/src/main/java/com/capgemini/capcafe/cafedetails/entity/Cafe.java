package com.capgemini.capcafe.cafedetails.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Cafe {
	
	@Id
	@JsonProperty("cafeId")
    private String cafeId;
	
	@JsonProperty("cafeName")
	private String cafeName;
	
	@JsonProperty("cafeOwner")
	private String cafeOwner;
	
	@JsonProperty("location")
	private String location;

	public String getCafeId() {
		return cafeId;
	}

	public String getCafeName() {
		return cafeName;
	}

	public String getCafeOwner() {
		return cafeOwner;
	}

	public String getLocation() {
		return location;
	}

	public void setCafeId(String cafeId) {
		this.cafeId = cafeId;
	}

	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}

	public void setCafeOwner(String cafeOwner) {
		this.cafeOwner = cafeOwner;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}

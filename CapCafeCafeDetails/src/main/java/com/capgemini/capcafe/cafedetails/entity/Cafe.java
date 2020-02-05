package com.capgemini.capcafe.cafedetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Cafe {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	@JsonProperty("cafeID")
    private String cafeID;
	
	@Getter
	@Setter
	@JsonProperty("cafeName")
	private String cafeName;
	
	@Getter
	@Setter
	@JsonProperty("cafeOwner")
	private String cafeOwner;
	
	@Getter
	@Setter
	@JsonProperty("location")
	private String location;
	
}

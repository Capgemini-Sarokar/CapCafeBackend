package com.capgemini.capcafe.cafedetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Cafe {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
    private String cafeID;
	
	@Getter
	@Setter
	private String cafeName;
	
	@Getter
	@Setter
	private String cafeOwner;
	
	@Getter
	@Setter
	private String Location;
	
}

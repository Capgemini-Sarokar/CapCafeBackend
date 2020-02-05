package com.capgemini.capcafe.helpdesk.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.capgemini.capcafe.helpdesk.utility.HelpdeskUtility;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Entity
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	@JsonProperty("orderID")
    public String orderID;
	
	@Getter
	@Setter
	@JsonProperty("comment")
	public String comment;
}
	

package com.capgemini.capcafe.loginregistration.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.capgemini.capcafe.loginregistration.utility.LoginRegistrationUtility;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Entity
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Getter
	@Setter
	@JsonProperty("employeeId")
	private String employeeId;
	
	@Getter
	@Setter
	@JsonProperty("emailId")
	private String emailId;
	
	@Getter
	@Setter
	@JsonProperty("name")
	private String name;
	
	@Getter
	@Setter
	@JsonProperty("phoneNumber")
	private String phoneNumber;
	
	@Getter
	@Setter
	@JsonProperty("dateOfBirth")
	private Calendar dateOfBirth;
	
	User () {
		
	}
	
	User (long id, String employeeId, String emailId, String name, String phoneNumber, Calendar dateOfBirth) {
		this.id = id;
		this.employeeId = employeeId;
		this.emailId = emailId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString () {
		return "{id="+this.id+", employeeId=" + this.employeeId + ", emailId=" + this.emailId +", name=" + this.name + ", phoneNumber=" 
				+ this.phoneNumber + ", dateOfBirth=" + LoginRegistrationUtility.calendarToString(this.dateOfBirth) + "}"; 
	}
}

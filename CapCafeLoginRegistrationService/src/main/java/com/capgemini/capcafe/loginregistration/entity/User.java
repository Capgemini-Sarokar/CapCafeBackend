package com.capgemini.capcafe.loginregistration.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
    private Long id;
	
	@Getter
	@Setter
	private String employeeId;
	
	@Getter
	@Setter
	private String emailId;
	
	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	private String phoneNumber;
	
	@Getter
	@Setter
	private Calendar dateOfBirth;
}

package com.capgemini.capcafe.loginregistration.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "User_Master")
public class UserEntity {

	@Id
	@JsonProperty("employeeId")
	@Column(name = "User_Id", length = 20, unique = true)
	@NotEmpty(message = "Employee id cannot be empty")
	private String employeeId;
	
	@JsonProperty("emailId")
	@Column(name = "User_Mail", length = 50, unique = true)
	@NotEmpty(message = "User mail cannot be empty")
	@Size(max = 50, message = "max size of User mail is 50")
	private String emailId;
	
	@JsonProperty("password")
	@Column(name = "User_Password", length = 256)
	@NotEmpty(message = "Password cannot be empty")
	@Size(max = 256, message = "max size of Password is 256")
	private String password;
	
	@JsonProperty("name")
	@Column(name = "User_Name", length = 50)
	@NotEmpty(message = "User name cannot be empty")
	@Size(max = 20, message = "max size of User name is 50")
	private String name;
	
	@JsonProperty("phoneNumber")
	@Column(name = "User_Phone", length = 11)
	@NotEmpty(message = "User phone number cannot be empty")
	@Size(max = 15, message = "max size of phone numbe is 15")
	private String phoneNumber;
	
	@JsonProperty("dateOfBirth")
	@Column(name = "User_DOB", nullable = false)
	private Calendar dateOfBirth;
	
	@JsonProperty("userRole")
	@Column(name = "User_Role", length = 20)
	@NotEmpty(message = "User role cannot be empty")
	@Size(max = 20, message = "max size of User role is 20")
	private String userRole;
	
	public String getEmployeeId() {
		return employeeId;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public UserEntity() {
		
	}

	public UserEntity(String employeeId, String emailId, String password, String name, 
			String phoneNumber, Calendar dateOfBirth, String userRole) {
		this.employeeId = employeeId;
		this.emailId = emailId;
		this.password = password;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "UserEntity [employeeId=" + employeeId + ", emailId=" + emailId + ", password=" + password + ", name="
				+ name + ", phoneNumber=" + phoneNumber + ", dateOfBirth=" + dateOfBirth + ", userRole=" + userRole
				+ "]";
	}

}

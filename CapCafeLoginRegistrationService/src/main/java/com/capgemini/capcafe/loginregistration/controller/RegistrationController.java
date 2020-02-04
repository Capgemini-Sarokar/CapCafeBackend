package com.capgemini.capcafe.loginregistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.capcafe.loginregistration.entity.User;
import com.capgemini.capcafe.loginregistration.exception.RegistrationException;
import com.capgemini.capcafe.loginregistration.service.RegistrationService;

@RestController
@RequestMapping(path = "/registration")
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	
	@RequestMapping(value = "newUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String registerNewUser (@RequestBody User newUser) {
		String responseString = "Your registration is successfull!";
		System.out.println(newUser);
		try {
			this.registrationService.registerNewUser(newUser);
		} catch (RegistrationException error) {
			responseString = "We ran into a problem during registration, " + error.getMessage();
		}
		return responseString;
	}
	
	@RequestMapping(value = "getUserById", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public User getUserById (@RequestBody long userId) {
		User existingUser = null;
		try {
			existingUser = this.registrationService.getUserById(userId);
		} catch (RegistrationException error) {
			// send a error response with the message: error.getMessage();
		}
		return existingUser;
	}
	
	@RequestMapping(value = "removeUserById", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String removeUserById (@RequestBody long userId) {
		String responseString = "User with User ID: " + userId + " has been removed!";
		try {
			this.registrationService.removeUser(userId);
		} catch (RegistrationException error) {
			responseString = "We ran into a problem during removal of the User with User ID: " + userId + " " + error.getMessage();
		}
		return responseString;
	}
}

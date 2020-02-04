package com.capgemini.capcafe.loginregistration.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public ResponseEntity < String > registerNewUser (@RequestBody User newUser) {
		String responseString = "Your registration is successfull!";
		try {
			this.registrationService.registerNewUser(newUser);
		} catch (RegistrationException error) {
			responseString = "We ran into a problem during registration; -> " + error.getMessage();
		}
		return new ResponseEntity < String > (responseString, HttpStatus.OK);
	}
	
	@RequestMapping(value = "getUserById", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity < Object > getUserById (@RequestBody Map<String, Long> requestBodyParams) {
		User existingUser = null;
		try {
			existingUser = this.registrationService.getUserById(requestBodyParams.get("userId"));
		} catch (RegistrationException error) {
			// send a error response with the message: error.getMessage();
			return new ResponseEntity < Object > (error.getMessage(), HttpStatus.OK);
		}
		return new ResponseEntity < Object > (existingUser, HttpStatus.OK);
	}
	
	@RequestMapping(value = "removeUserById", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity < String > removeUserById (@RequestBody Map<String, Long> requestBodyParams) {
		String responseString = "User with User ID: " + requestBodyParams.get("userId") + " has been removed!";
		try {
			this.registrationService.removeUser(requestBodyParams.get("userId"));
		} catch (RegistrationException error) {
			responseString = "We ran into a problem during removal of the User with User ID: " 
					+ requestBodyParams.get("userId") + "; -> " + error.getMessage();
		}
		return new ResponseEntity < String > (responseString, HttpStatus.OK);
	}
}

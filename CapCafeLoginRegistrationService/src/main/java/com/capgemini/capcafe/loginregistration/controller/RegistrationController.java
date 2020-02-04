package com.capgemini.capcafe.loginregistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.capcafe.loginregistration.entity.User;
import com.capgemini.capcafe.loginregistration.service.RegistrationService;

@RestController
@RequestMapping(path = "/registration")
public class RegistrationController {
	
	@SuppressWarnings("unused")
	@Autowired
	private RegistrationService registrationService;
	
	@RequestMapping(path = "/newUser")
	public void registerNewUser (@RequestBody User newUser) {
		
	}
	
	@RequestMapping(path = "/getUserById")
	public User getUserById (@RequestBody long userId) {
		return null;
	}
	
	
}

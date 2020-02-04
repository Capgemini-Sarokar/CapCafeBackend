package com.capgemini.capcafe.loginregistration.service;

import com.capgemini.capcafe.loginregistration.entity.User;
import com.capgemini.capcafe.loginregistration.exception.RegistrationException;

public interface RegistrationService {
	
	public void registerNewUser (User newUser) throws RegistrationException;
}

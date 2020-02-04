package com.capgemini.capcafe.loginregistration.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.capgemini.capcafe.loginregistration.entity.User;
import com.capgemini.capcafe.loginregistration.exception.RegistrationException;
import com.capgemini.capcafe.loginregistration.persistence.RegistrationPersistence;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationPersistence registrationDao;
	
	@Override
	public void registerNewUser(User newUser) throws RegistrationException {
		try {
			this.registrationDao.save(newUser);
		} catch (IllegalArgumentException error) {
			throw new RegistrationException ("Invalid User Details Passed");
		}
		return;
	}

	@Override
	public User getUserById(long userId) throws RegistrationException {
		User existingUser = null;
		try {
			existingUser = this.registrationDao.findById(userId).get();
		} catch (IllegalArgumentException error) {
			throw new RegistrationException ("Invalid User ID Passed");
		} catch (NoSuchElementException error) {
			throw new RegistrationException ("The requested user does not exist");
		}
		return existingUser;
	}

	@Override
	public void removeUser(long userId) throws RegistrationException {
		try {
			this.registrationDao.deleteById(userId);
		} catch (IllegalArgumentException error) {
			throw new RegistrationException ("Invalid User ID Passed");
		} catch (EmptyResultDataAccessException error) {
			throw new RegistrationException ("The expected user does not exist");
		}
		return;
	}

}

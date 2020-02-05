package com.capgemini.capcafe.loginregistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.capgemini.capcafe.loginregistration.entity.UserEntity;
import com.capgemini.capcafe.loginregistration.exception.UserException;
import com.capgemini.capcafe.loginregistration.persistence.UserPersistence;

public class UserServiceImpl implements UserService {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserPersistence userDao;
	
	@Override
	public UserEntity signUp(UserEntity user) throws UserException {
		String password = user.getPassword();
		String encodedPassword = passwordEncoder.encode(password);
		user.setPassword(encodedPassword);
		UserEntity emp = this.userDao.save(user);
		if(emp == null)
			throw new UserException("Unable to save. Something went wrong. Please try again");
		return emp;
	}

	@Override
	public UserEntity getById(String id) throws UserException {
		UserEntity user;
		try {
			user = this.userDao.findById(id).get();
		} catch (Exception e) {
			throw new UserException("User not found with id: " + id);
		}
		return user;
	}

	@Override
	public UserEntity update(UserEntity employee) {
		return this.userDao.save(employee); 
	}

	@Override
	public boolean newPassword(String id, String prevpass, String newpass) throws UserException {
		UserEntity user;
		try {
			user = this.userDao.findById(id).get();
		} catch (Exception error) {
			throw new UserException("User not found with id: " + id + "; ->" + error.getMessage());
		}
		String userEncodedPassword = user.getPassword();
		if (passwordEncoder.matches(prevpass, userEncodedPassword)) {
			String newEncodedPassword = passwordEncoder.encode(newpass);
			user.setPassword(newEncodedPassword);
			this.userDao.save(user);
			return true;
		} else {
			throw new UserException("Password does not match. Please enter valid password");
		}
	}

	@Override
	public boolean deleteById(String id) throws UserException {
		UserEntity user;
		try {
			user = this.userDao.findById(id).get();
		} catch (Exception error) {
			throw new UserException("User not found with id: " + id + "; ->" + error.getMessage());
		}
		this.userDao.delete(user);
		return true;
	}

	@Override
	public UserEntity login(String id, String password) throws UserException {
		UserEntity user;
		try {
			user = this.userDao.findById(id).get();
		} catch (Exception error) {
			throw new UserException("User not found with id: " + id + "; ->" + error.getMessage());
		}
		String encodedPassword = user.getPassword();
		if (passwordEncoder.matches(password, encodedPassword)) {
			return user;
		} else {
			throw new UserException("Password does not match. Please enter valid password");
		}
	}

	@Override
	public List<UserEntity> getAll() throws UserException {
		try {
			return this.userDao.findAll();
		} catch (Exception error) {
			throw new UserException("User list is empty: ->" + error.getMessage());
		}
	}

}

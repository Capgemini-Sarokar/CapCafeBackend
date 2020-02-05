package com.capgemini.capcafe.loginregistration.service;

import java.util.List;

import com.capgemini.capcafe.loginregistration.entity.UserEntity;
import com.capgemini.capcafe.loginregistration.exception.UserException;

public interface UserService {

	UserEntity signUp (UserEntity employee) throws UserException;

	UserEntity getById (String id) throws UserException;

	UserEntity update (UserEntity employee);

	boolean newPassword (String id, String prevpass, String newpass) throws UserException, UserException;

	boolean deleteById (String id) throws UserException;

	UserEntity login (String id, String password) throws UserException, UserException;

	List<UserEntity> getAll () throws UserException;

}

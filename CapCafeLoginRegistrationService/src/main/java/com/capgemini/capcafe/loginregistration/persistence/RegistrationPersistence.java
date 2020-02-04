package com.capgemini.capcafe.loginregistration.persistence;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.capcafe.loginregistration.entity.User;

public interface RegistrationPersistence extends CrudRepository<User, Long> {

}

package com.capgemini.capcafe.loginregistration.persistence;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

public interface RegistrationPersistence<T> extends CrudRepository<T, Id> {

}

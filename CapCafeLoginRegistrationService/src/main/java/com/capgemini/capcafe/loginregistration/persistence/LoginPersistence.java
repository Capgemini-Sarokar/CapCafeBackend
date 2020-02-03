package com.capgemini.capcafe.loginregistration.persistence;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

public interface LoginPersistence<T> extends CrudRepository<T, Id> {

}

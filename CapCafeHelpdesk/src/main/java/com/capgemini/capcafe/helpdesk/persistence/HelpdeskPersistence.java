package com.capgemini.capcafe.helpdesk.persistence;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.capcafe.helpdesk.entity.Cafe;

public interface HelpdeskPersistence extends CrudRepository<Order, String> {

}
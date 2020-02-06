package com.capgemini.capcafe.helpdesk.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capcafe.helpdesk.entity.Orders;

public interface HelpdeskPersistence extends JpaRepository<Orders,Integer> {
	
}
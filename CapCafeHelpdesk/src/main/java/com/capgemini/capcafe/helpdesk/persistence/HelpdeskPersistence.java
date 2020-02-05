package com.capgemini.capcafe.helpdesk.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelpdeskPersistence extends JpaRepository<User,Integer> {
	
}
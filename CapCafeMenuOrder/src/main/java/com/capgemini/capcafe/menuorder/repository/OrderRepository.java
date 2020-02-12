package com.capgemini.capcafe.menuorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capcafe.menuorder.model.Ordering;

public interface OrderRepository extends JpaRepository<Ordering, Integer>{

}

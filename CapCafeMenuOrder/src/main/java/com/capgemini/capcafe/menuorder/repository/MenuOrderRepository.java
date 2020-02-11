package com.capgemini.capcafe.menuorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capcafe.menuorder.model.MenuOrder;

public interface MenuOrderRepository extends JpaRepository<MenuOrder, String>{


    
}

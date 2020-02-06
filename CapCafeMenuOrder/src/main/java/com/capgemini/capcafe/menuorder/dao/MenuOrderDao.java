package com.capgemini.capcafe.menuorder.dao;

import org.springframework.stereotype.Repository;

import com.capgemini.capcafe.menuorder.exception.MenuOrderException;
import com.capgemini.capcafe.menuorder.model.MenuOrder;


@Repository
public interface MenuOrderDao {
	
	
		public String addMenuDetails(MenuOrder menu) throws MenuOrderException;

	

}

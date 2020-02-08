package com.capgemini.capcafe.menuorder.repository;

import java.awt.Menu;

import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.capgemini.capcafe.menuorder.model.MenuOrder;

import antlr.collections.List;

public interface menuorderrepository extends CrudRepository<MenuOrder, String>{


    
}

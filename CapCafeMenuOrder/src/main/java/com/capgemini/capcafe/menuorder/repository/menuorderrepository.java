package com.capgemini.capcafe.menuorder.repository;

import java.awt.Menu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.capgemini.capcafe.menuorder.model.MenuOrder;

public interface menuorderrepository extends JpaRepository<MenuOrder, String> {

}

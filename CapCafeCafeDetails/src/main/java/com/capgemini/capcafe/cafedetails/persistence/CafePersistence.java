package com.capgemini.capcafe.cafedetails.persistence;


import org.springframework.data.repository.CrudRepository;

import com.capgemini.capcafe.cafedetails.entity.Cafe;

public interface CafePersistence extends CrudRepository<Cafe, String> {

}
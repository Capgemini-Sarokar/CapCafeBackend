package com.capgemini.capcafe.cafedetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.capcafe.cafedetails.entity.Cafe;
import com.capgemini.capcafe.cafedetails.service.CafeService;

@RestController
@RequestMapping(path = "/cafeManagement")
public class CafeController {
	
	@SuppressWarnings("unused")
	@Autowired
	private CafeService CafeService; 
	@RequestMapping(path = "/newCafe")
	public void addNewCafe (@RequestBody Cafe newCafe) {
		
	}	
	
	@RequestMapping(path = "/getCafeById")
	public Cafe getCafeById (@RequestBody String cafeID) {
		return null;
	}
	
	@RequestMapping (path = "/removeCafeById")
		public Cafe removeCafe (@RequestBody String cafeID) {
			return null;
		}
	
	@RequestMapping(path = "/getAllCafe")
	public List<Cafe> getAllCafe () {
		return null;
	}
	}

package com.capgemini.capcafe.cafedetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.capcafe.cafedetails.entity.Cafe;
import com.capgemini.capcafe.cafedetails.service.CafeService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(path = "/cafeManagement")
public class CafeController {

	@Autowired
	private CafeService cafeService;

	@PostMapping(path = "/newCafe")
	public void addNewCafe(@RequestBody Cafe newCafe) {
		this.cafeService.addCafe(newCafe);
	}

	@PostMapping(path = "/getCafeById")
	public Cafe getCafeById(@RequestBody String cafeID) {
		return null;
	}

	@PostMapping(path = "/removeCafeById")
	public Cafe removeCafe(@RequestBody String cafeID) {
		return null;
	}

	@GetMapping(path = "/getAllCafe")
	public List<Cafe> getAllCafe() {
		return null;
	}
	
	@PostMapping(path = "/updateCafe")
	public Cafe updateCafe (@RequestBody Cafe cafe) {
		return null;
	}
}

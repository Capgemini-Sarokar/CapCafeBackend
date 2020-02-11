package com.capgemini.capcafe.cafedetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.capcafe.cafedetails.entity.Cafe;
import com.capgemini.capcafe.cafedetails.exception.CafeException;
import com.capgemini.capcafe.cafedetails.service.CafeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/cafe-portal")
public class CafeController {

	@Autowired
	private CafeService cafeService;

	@PostMapping(path = "/addCafe")
	public void addNewCafe(@RequestBody Cafe newCafe) {
		this.cafeService.addCafe(newCafe);
	}

	@GetMapping(path = "/{id}")
	public Cafe getCafeById(@PathVariable("id") String id) throws CafeException {
		return this.cafeService.fetchCafeById(id);
	}

	@GetMapping(path = "/remove/{id}" )
	public boolean removeCafe(@PathVariable("id") String id) throws CafeException {
		return this.cafeService.removeCafe(id);
	
	}

	@GetMapping(path = "/viewAllCafes")
	public List<Cafe> getAllCafe() {
		return this.cafeService.fetchAllCafe();
	}
	
	@PutMapping(path = "/updateCafe")
	public Cafe updateCafe (@RequestBody Cafe cafe) {
		return this.cafeService.updateCafe(cafe);
	}
}

package com.capgemini.capcafe.review.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.capcafe.review.entity.CafeRatingEntity;
import com.capgemini.capcafe.review.entity.FoodRatingEntity;
import com.capgemini.capcafe.review.persistence.CafeRatingRepo;
import com.capgemini.capcafe.review.persistence.FoodRatingRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/reviews")
public class TestController {

	@Autowired
	private CafeRatingRepo cafeRatingRepo;
	
	@Autowired
	private FoodRatingRepo foodRatingRepo;
	
	@GetMapping(value = "/getReviewsForCafe/{cafeId}")
	public List<CafeRatingEntity> getReviewsForCafe (@PathVariable("cafeId") String cafeId) {
		//return this.cafeRatingRepo.findByCafeId(cafeId);
		return this.cafeRatingRepo.findAll();
	}
	
	@GetMapping(value = "/getReviewsForFoodItem/{cafeId}/{foodId}")
	public List<FoodRatingEntity> getReviewsForFoodItem (@PathVariable("cafeId") String cafeId, @PathVariable("foodId") String foodId) {
		return this.foodRatingRepo.findByCafeIdAndFoodId(cafeId, foodId);
	}

}

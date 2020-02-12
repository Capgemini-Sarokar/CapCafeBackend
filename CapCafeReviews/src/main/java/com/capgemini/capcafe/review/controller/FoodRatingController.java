package com.capgemini.capcafe.review.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.capcafe.review.entity.FoodRatingEntity;
import com.capgemini.capcafe.review.exception.ReviewException;
import com.capgemini.capcafe.service.FoodRatingService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/foodRating")
public class FoodRatingController {
	
@Autowired
FoodRatingService foodRatingService;

@PostMapping(path="/addCafeRating")
public void addNewReview(@RequestBody FoodRatingEntity foodRatingEntity) throws ReviewException {
	this.foodRatingService.addRating(foodRatingEntity);
}

@GetMapping(path="/getRatingById/{id}")
public List<FoodRatingEntity> getRatingById(@PathVariable("id") String id) throws ReviewException {
	return (List<FoodRatingEntity>) this.foodRatingService.fetchRatingById(id);
}

@DeleteMapping(path = { "/removeRatingById/{Id}" })
public boolean removeReviewById ( @PathVariable("Id") String Id) throws ReviewException {
	return this.foodRatingService.removeRating(Id);
}

@GetMapping(path="/getAllRating")
public List<FoodRatingEntity> getAllRating() throws ReviewException {
	return this.foodRatingService.fetchRating();
}

@GetMapping(path="/getRatingByCafeId/{id}/{id1}")
public List<FoodRatingEntity> getRatingByFoodId(@PathVariable("id") String id, @PathVariable("id1") String id1) throws ReviewException {
	return (List<FoodRatingEntity>) this.foodRatingService.getRatingsByFoodId(id,id1);
}

}

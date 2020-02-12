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
import com.capgemini.capcafe.review.entity.CafeRatingEntity;
import com.capgemini.capcafe.review.exception.ReviewException;
import com.capgemini.capcafe.service.RatingService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/cafereview")
public class CafeRatingController {
	
@Autowired
RatingService cafeRatingService;

@PostMapping(path="/addCafeRating")
public void addNewReview(@RequestBody CafeRatingEntity cafeRatingEntity) {
	try {
		this.cafeRatingService.addReview(cafeRatingEntity);
	} catch (ReviewException e) {
		e.printStackTrace();
	}
}

@GetMapping(path="/getRatingById/{id}")
public List<CafeRatingEntity> getRatingById(@PathVariable("id") String id) throws ReviewException {
	return (List<CafeRatingEntity>) this.cafeRatingService.getReviewsById(id);
}

@DeleteMapping(path = { "/removeRatingById/{Id}" })
public boolean removeReviewById ( @PathVariable("Id") String Id) throws ReviewException {
	return this.cafeRatingService.deleteReview(Id);
}

@GetMapping(path="/getAllRating")
public List<CafeRatingEntity> getAllRating() throws ReviewException {
	return this.cafeRatingService.getAllReviews();
}

@GetMapping(path="/getRatingByCafeId/{id}")
public List<CafeRatingEntity> getRatingByCafeId(@PathVariable("id") String id) throws ReviewException {
	return (List<CafeRatingEntity>) this.cafeRatingService.getReviewsByCafeId(id);
}


}
package com.capgemini.capcafe.review.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Ratings_Master")
public class FoodRatingEntity {

	@Id
	@JsonProperty("reviewId")
	@Column(name = "Review_Id", length = 20, unique = true)
	private String reviewId;
	
	@JsonProperty("cafeId")
	@Column(name = "Cafe_Id")
	private String cafeId;		// this says for which cafe this review is written
	
	@JsonProperty("foodId")
	@Column(name = "Food_Id")
	private String foodId;		// this says for which food item this review is written
	
	@JsonProperty("userId")
	@Column(name = "User_Id")
	private String userId;		// this says who wrote this review for this cafe
	
	@JsonProperty("comment")
	@Column(name = "Comment")
	private String comment;		// the review string
	
	@JsonProperty("rating")
	@Column(name = "Rating")
	private float rating;
	
	public FoodRatingEntity() {
		
	}

	public FoodRatingEntity(String reviewId, String cafeId, String foodId, String userId, String comment,
			float rating) {
		super();
		this.reviewId = reviewId;
		this.cafeId = cafeId;
		this.foodId = foodId;
		this.userId = userId;
		this.comment = comment;
		this.rating = rating;
	}

	public String getReviewId() {
		return reviewId;
	}

	public String getCafeId() {
		return cafeId;
	}

	public String getFoodId() {
		return foodId;
	}

	public String getUserId() {
		return userId;
	}

	public String getComment() {
		return comment;
	}

	public float getRating() {
		return rating;
	}

	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}

	public void setCafeId(String cafeId) {
		this.cafeId = cafeId;
	}

	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "FoodRatingEntity [reviewId=" + reviewId + ", cafeId=" + cafeId + ", foodId=" + foodId + ", userId="
				+ userId + ", comment=" + comment + ", rating=" + rating + "]";
	}

	
}

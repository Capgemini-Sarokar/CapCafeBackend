package com.capgemini.capcafe.review.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Cafe_Rating_Master")
public class CafeRatingEntity {

	@Id
	@JsonProperty("reviewId")
	@Column(name = "Review_Id", length = 20, unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String reviewId;
	
	@JsonProperty("cafeId")
	@Column(name = "Cafe_Id")
	private String cafeId;		// this says for which cafe this review is written
	
	@JsonProperty("userId")
	@Column(name = "User_Id")
	private String userId;		// this says who wrote this review for this cafe
	
	@JsonProperty("comment")
	@Column(name = "Comment")
	private String comment;		// the review string
	
	@JsonProperty("rating")
	@Column(name = "Rating")
	private float rating;
	
	public CafeRatingEntity() {
		
	}

	public CafeRatingEntity(String reviewId, String cafeId, String userId, String comment, float rating) {
		super();
		this.reviewId = reviewId;
		this.cafeId = cafeId;
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
		return "CafeRatingEntity [reviewId=" + reviewId + ", cafeId=" + cafeId + ", userId=" + userId + ", comment="
				+ comment + ", rating=" + rating + "]";
	}

}

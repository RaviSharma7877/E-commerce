package com.masai.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Wishlists {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wishlistId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products product;
    private LocalDate addedDate;
	public Wishlists(Long wishlistId, User user, Products product, LocalDate addedDate) {
		super();
		this.wishlistId = wishlistId;
		this.user = user;
		this.product = product;
		this.addedDate = addedDate;
	}
	public Long getWishlistId() {
		return wishlistId;
	}
	public void setWishlistId(Long wishlistId) {
		this.wishlistId = wishlistId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Products getProduct() {
		return product;
	}
	public void setProduct(Products product) {
		this.product = product;
	}
	public LocalDate getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(LocalDate addedDate) {
		this.addedDate = addedDate;
	}
    
    
}

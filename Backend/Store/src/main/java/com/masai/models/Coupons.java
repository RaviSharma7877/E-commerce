package com.masai.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Coupons {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long couponId;
    private String couponCode;
    private BigDecimal discountPercentage;
    private LocalDate expirationDate;
	public Coupons(Long couponId, String couponCode, BigDecimal discountPercentage, LocalDate expirationDate) {
		super();
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.discountPercentage = discountPercentage;
		this.expirationDate = expirationDate;
	}
	public Long getCouponId() {
		return couponId;
	}
	public void setCouponId(Long couponId) {
		this.couponId = couponId;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public BigDecimal getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(BigDecimal discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public LocalDate getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}
    
    
}

package com.masai.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String addressType;
    private String street;
    private String city;
    private String state;
    private String postalCode;
	public Address(Long addressId, User user, String addressType, String street, String city, String state,
			String postalCode) {
		super();
		this.addressId = addressId;
		this.user = user;
		this.addressType = addressType;
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
    
    
}

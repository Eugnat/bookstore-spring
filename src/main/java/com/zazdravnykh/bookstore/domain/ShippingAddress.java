package com.zazdravnykh.bookstore.domain;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class ShippingAddress implements Serializable {

	private static final long serialVersionUID = 1124155792656375708L;

	@NotBlank
	private String houseNumber;

	@NotBlank
	@Pattern(regexp = "[0-9]{1,3}", message = "only numbers, no more than 3")
	private String flatNumber;

	@NotBlank
	private String street;

	@NotBlank
	private String city;

	@NotBlank
	private String state;

	@NotBlank
	@Pattern(regexp = "[0-9]{5}", message = "five-digit zip index")
	private String zip;

	public ShippingAddress() {
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

}

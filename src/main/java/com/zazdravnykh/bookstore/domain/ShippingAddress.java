package com.zazdravnykh.bookstore.domain;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class ShippingAddress implements Serializable {

	private static final long serialVersionUID = 1124155792656375708L;

	@NotBlank(message = "{NotBlank.ShippingAddress.houseNumber.validation}")
	private String houseNumber;

	@NotBlank(message = "{NotBlank.ShippingAddress.flatNumber.validation}")
	@Pattern(regexp = "[0-9]{1,3}", message = "{Pattern.ShippingAddress.flatNumber.validation}")
	private String flatNumber;

	@NotBlank(message = "{NotBlank.ShippingAddress.street.validation}")
	private String street;

	@NotBlank(message = "{NotBlank.ShippingAddress.city.validation}")
	private String city;

	@NotBlank(message = "{NotBlank.ShippingAddress.state.validation}")
	private String state;

	@NotBlank(message = "{NotBlank.ShippingAddress.zip.validation}")
	@Pattern(regexp = "[0-9]{5}", message = "{Pattern.ShippingAddress.zip.validation}")
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

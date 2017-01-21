package com.zazdravnykh.bookstore.domain;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class CreditCard implements Serializable {

	private static final long serialVersionUID = 8841312676466496531L;

	@NotBlank
	@Pattern(regexp = "[0-9]{16}", message = "12 digit number")
	private String cardNumber;

	@NotBlank
	@Pattern(regexp = "[0-9]{3}", message = "3 digit number")
	private String ccvNumber;

	@NotBlank
	private String name;

	@NotBlank
	@Pattern(regexp = "[0-9]{2}/[0-9]{2}")
	private String validity;

	public CreditCard() {
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCcvNumber() {
		return ccvNumber;
	}

	public void setCcvNumber(String ccvNumber) {
		this.ccvNumber = ccvNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditCard other = (CreditCard) obj;
		if (cardNumber == null) {
			if (other.cardNumber != null)
				return false;
		} else if (!cardNumber.equals(other.cardNumber))
			return false;
		return true;
	}

}

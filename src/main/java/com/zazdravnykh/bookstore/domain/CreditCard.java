package com.zazdravnykh.bookstore.domain;

public class CreditCard {

	private long cardNumber;

	private int ccvNumber;

	private String cardHolderName;

	private String cardHolderSurname;

	public CreditCard() {
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCcvNumber() {
		return ccvNumber;
	}

	public void setCcvNumber(int ccvNumber) {
		this.ccvNumber = ccvNumber;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCardHolderSurname() {
		return cardHolderSurname;
	}

	public void setCardHolderSurname(String cardHolderSurname) {
		this.cardHolderSurname = cardHolderSurname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cardNumber ^ (cardNumber >>> 32));
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
		if (cardNumber != other.cardNumber)
			return false;
		return true;
	}

}

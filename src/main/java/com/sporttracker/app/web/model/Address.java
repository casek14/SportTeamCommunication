package com.sporttracker.app.web.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String street;
	
	private String postCode; //postovni smerovaci cislo
	
	private String cp; //cislo popisne
	
	private String city;

	

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
	
}

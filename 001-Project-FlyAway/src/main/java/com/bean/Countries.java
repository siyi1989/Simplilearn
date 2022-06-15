package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Countries {
	
	@Id
	private String ccountry;

	public String getCcountry() {
		return ccountry;
	}

	public void setCcountry(String ccountry) {
		this.ccountry = ccountry;
	}

	@Override
	public String toString() {
		return "Countries [ccountry=" + ccountry + "]";
	}

	public Countries(String ccountry) {
		super();
		this.ccountry = ccountry;
	}

	public Countries() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}

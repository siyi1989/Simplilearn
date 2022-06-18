package com.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class Airports {

	@Id
	private String airport;
	private String ccountry;

	public String getAirport() {
		return airport;
	}
	public void setAirport(String airport) {
		this.airport = airport;
	}
	public String getccountry() {
		return ccountry;
	}
	public void setccountry(String ccountry) {
		this.ccountry = ccountry;
	}
	@Override
	public String toString() {
		return "Airports [airport=" + airport + ", ccountry=" + ccountry + "]";
	}
	public Airports(String airport, String ccountry) {
		super();
		this.airport = airport;
		this.ccountry = ccountry;
	}
	public Airports() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

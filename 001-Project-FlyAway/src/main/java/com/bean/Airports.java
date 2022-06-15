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
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="acountry",referencedColumnName="ccountry")
	private String acountry;

	public String getAirport() {
		return airport;
	}
	public void setAirport(String airport) {
		this.airport = airport;
	}
	public String getAcountry() {
		return acountry;
	}
	public void setAcountry(String acountry) {
		this.acountry = acountry;
	}
	@Override
	public String toString() {
		return "Airports [airport=" + airport + ", acountry=" + acountry + "]";
	}
	public Airports(String airport, String acountry) {
		super();
		this.airport = airport;
		this.acountry = acountry;
	}
	public Airports() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

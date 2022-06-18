package com.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Countries {
	
	@Id
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="caid",referencedColumnName="ccountry")
	private String ccountry;
	private List<Airports>listOfPort;



	public String getCcountry() {
		return ccountry;
	}



	public void setCcountry(String ccountry) {
		this.ccountry = ccountry;
	}



	public List<Airports> getListOfPort() {
		return listOfPort;
	}



	public void setListOfPort(List<Airports> listOfPort) {
		this.listOfPort = listOfPort;
	}



	@Override
	public String toString() {
		return "Countries [ccountry=" + ccountry + ", listOfPort=" + listOfPort + "]";
	}



	public Countries(String ccountry, List<Airports> listOfPort) {
		super();
		this.ccountry = ccountry;
		this.listOfPort = listOfPort;
	}



	public Countries() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	

	
}

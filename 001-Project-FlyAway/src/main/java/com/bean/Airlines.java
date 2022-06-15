package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airlines {

	@Id
	private String lairline;

	public String getLairline() {
		return lairline;
	}

	public void setLairline(String lairline) {
		this.lairline = lairline;
	}

	public Airlines(String lairline) {
		super();
		this.lairline = lairline;
	}

	public Airlines() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
}

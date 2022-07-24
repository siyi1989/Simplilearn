package com.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Product {

	@Id
	private long prodid;
	private String proddesc;
	private float prodprice;
	private int prodqty;
//	@Autowired
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="catname")
//	private Category cat;
	
	private String cat;

	public long getProdid() {
		return prodid;
	}

	public void setProdid(long prodid) {
		this.prodid = prodid;
	}

	public String getProddesc() {
		return proddesc;
	}

	public void setProddesc(String proddesc) {
		this.proddesc = proddesc;
	}

	public float getProdprice() {
		return prodprice;
	}

	public void setProdprice(float prodprice) {
		this.prodprice = prodprice;
	}

	public int getProdqty() {
		return prodqty;
	}

	public void setProdqty(int prodqty) {
		this.prodqty = prodqty;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}
	
	
	
	
}

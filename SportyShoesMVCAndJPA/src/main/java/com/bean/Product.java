package com.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int prodid;
	private String proddesc;
	private float prodprice;
	private int prodqty;
//	@Autowired
//	@ManyToOne(cascade = CascadeType.ALL,targetEntity=com.bean.Category.class)
//	@JoinTable(joinColumns=@JoinColumn(name="prodid",referencedColumnName="prodid"),
//	inverseJoinColumns=@JoinColumn(name="catid",referencedColumnName="catid"))
//	private Category cat;
	
	private int prodcatid;
	
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
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
	public int getProdcatid() {
		return prodcatid;
	}
	public void setProdcatid(int prodcatid) {
		this.prodcatid = prodcatid;
	}

	
	
	
}

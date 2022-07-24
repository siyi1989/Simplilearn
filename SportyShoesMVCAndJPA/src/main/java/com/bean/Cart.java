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
public class Cart {

	@Id
	private long cartid;
	private String cartdesc;
	private float cartprice;
	private int cartqty;
//	@Autowired
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="catname")
//	private Category cat;
	
	private String cat;

	public long getCartid() {
		return cartid;
	}

	public void setCartid(long cartid) {
		this.cartid = cartid;
	}

	public String getCartdesc() {
		return cartdesc;
	}

	public void setCartdesc(String cartdesc) {
		this.cartdesc = cartdesc;
	}

	public float getCartprice() {
		return cartprice;
	}

	public void setCartprice(float cartprice) {
		this.cartprice = cartprice;
	}

	public int getCartqty() {
		return cartqty;
	}

	public void setCartqty(int cartqty) {
		this.cartqty = cartqty;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}
	
	
	
	
	
	
	
}

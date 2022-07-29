package com.bean;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Purchase {

	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int purid;
	private int puruserid;
	private int purprodid;
	private Date purdate;
	private float purprice;
	private int purqty;
	private Long purtotal;
	private String cart;
	
	public Long getPurtotal() {
		return purtotal;
	}
	public void setPurtotal(Long purtotal) {
		this.purtotal = purtotal;
	}
	public int getPurid() {
		return purid;
	}
	public String getCart() {
		return cart;
	}
	public void setCart(String cart) {
		this.cart = cart;
	}
	public void setPurid(int purid) {
		this.purid = purid;
	}
	public int getPuruserid() {
		return puruserid;
	}
	public void setPuruserid(int puruserid) {
		this.puruserid = puruserid;
	}
	public int getPurprodid() {
		return purprodid;
	}
	public void setPurprodid(int purprodid) {
		this.purprodid = purprodid;
	}
	public Date getPurdate() {
		return purdate;
	}
	public void setPurdate(Date purdate) {
		this.purdate = purdate;
	}
	public float getPurprice() {
		return purprice;
	}
	public void setPurprice(float purprice) {
		this.purprice = purprice;
	}
	public int getPurqty() {
		return purqty;
	}
	public void setPurqty(int purqty) {
		this.purqty = purqty;
	}

	
	
	
	
	
}

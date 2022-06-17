package com.bean;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity

public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bid;
	private String bss;
	private Date bsstime;
	private Date bdate;
	private String bsourceport;
	private String bdestport;
	private String bairline;
	private float bprice;
	private String bsource;
	private String bdestination;
	private int bslot;
	private float bpaid;
	@ManyToOne(cascade=CascadeType.ALL) //through main object, user can save/update/delete another table
	@JoinColumn(name="bfid",referencedColumnName="fid")
	private int bfid;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBss() {
		return bss;
	}
	public void setBss(String bss) {
		this.bss = bss;
	}
	public Date getBsstime() {
		return bsstime;
	}
	public void setBsstime(Date bsstime) {
		this.bsstime = bsstime;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	public String getBsourceport() {
		return bsourceport;
	}
	public void setBsourceport(String bsourceport) {
		this.bsourceport = bsourceport;
	}
	public String getBdestport() {
		return bdestport;
	}
	public void setBdestport(String bdestport) {
		this.bdestport = bdestport;
	}
	public String getBairline() {
		return bairline;
	}
	public void setBairline(String bairline) {
		this.bairline = bairline;
	}
	public float getBprice() {
		return bprice;
	}
	public void setBprice(float bprice) {
		this.bprice = bprice;
	}
	public String getBsource() {
		return bsource;
	}
	public void setBsource(String bsource) {
		this.bsource = bsource;
	}
	public String getBdestination() {
		return bdestination;
	}
	public void setBdestination(String bdestination) {
		this.bdestination = bdestination;
	}
	public int getBslot() {
		return bslot;
	}
	public void setBslot(int bslot) {
		this.bslot = bslot;
	}
	public float getBpaid() {
		return bpaid;
	}
	public void setBpaid(float bpaid) {
		this.bpaid = bpaid;
	}
	public int getBfid() {
		return bfid;
	}
	public void setBfid(int bfid) {
		this.bfid = bfid;
	}
	@Override
	public String toString() {
		return "Booking [bid=" + bid + ", bss=" + bss + ", bsstime=" + bsstime + ", bdate=" + bdate + ", bsourceport="
				+ bsourceport + ", bdestport=" + bdestport + ", bairline=" + bairline + ", bprice=" + bprice
				+ ", bsource=" + bsource + ", bdestination=" + bdestination + ", bslot=" + bslot + ", bpaid=" + bpaid
				+ ", bfid=" + bfid + "]";
	}
	public Booking(int bid, String bss, Date bsstime, Date bdate, String bsourceport, String bdestport, String bairline,
			float bprice, String bsource, String bdestination, int bslot, float bpaid, int bfid) {
		super();
		this.bid = bid;
		this.bss = bss;
		this.bsstime = bsstime;
		this.bdate = bdate;
		this.bsourceport = bsourceport;
		this.bdestport = bdestport;
		this.bairline = bairline;
		this.bprice = bprice;
		this.bsource = bsource;
		this.bdestination = bdestination;
		this.bslot = bslot;
		this.bpaid = bpaid;
		this.bfid = bfid;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}

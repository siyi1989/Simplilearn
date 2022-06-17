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


public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int fid;
	private Date fdate;
	@ManyToOne(cascade=CascadeType.ALL) //through main object, user can save/update/delete another table
	@JoinColumn(name="fsourceport",referencedColumnName="airport")
	@JoinColumn(name="fdestport",referencedColumnName="airport")
	private String fsourceport;
	private String fdestport;
	private String fairline;
	private float fprice;
	private String fsource;
	private String fdestination;
	private int fslot;
	
	
	
	public int getFid() {
		return fid;
	}



	public void setFid(int fid) {
		this.fid = fid;
	}



	public Date getFdate() {
		return fdate;
	}



	public void setFdate(Date fdate) {
		this.fdate = fdate;
	}



	public String getFsourceport() {
		return fsourceport;
	}



	public void setFsourceport(String fsourceport) {
		this.fsourceport = fsourceport;
	}



	public String getFdestport() {
		return fdestport;
	}



	public void setFdestport(String fdestport) {
		this.fdestport = fdestport;
	}



	public String getFairline() {
		return fairline;
	}



	public void setFairline(String fairline) {
		this.fairline = fairline;
	}



	public float getFprice() {
		return fprice;
	}



	public void setFprice(float fprice) {
		this.fprice = fprice;
	}



	public String getFsource() {
		return fsource;
	}



	public void setFsource(String fsource) {
		this.fsource = fsource;
	}



	public String getFdestination() {
		return fdestination;
	}



	public void setFdestination(String fdestination) {
		this.fdestination = fdestination;
	}



	public int getFslot() {
		return fslot;
	}



	public void setFslot(int fslot) {
		this.fslot = fslot;
	}



	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Product(int fid, Date fdate, String fsourceport, String fdestport, String fairline, float fprice,
			String fsource, String fdestination, int fslot) {
		super();
		this.fid = fid;
		this.fdate = fdate;
		this.fsourceport = fsourceport;
		this.fdestport = fdestport;
		this.fairline = fairline;
		this.fprice = fprice;
		this.fsource = fsource;
		this.fdestination = fdestination;
		this.fslot = fslot;
	}



	@Override
	public String toString() {
		return "Product [fid=" + fid + ", fdate=" + fdate + ", fsourceport=" + fsourceport + ", fdestport=" + fdestport
				+ ", fairline=" + fairline + ", fprice=" + fprice + ", fsource=" + fsource + ", fdestination="
				+ fdestination + ", fslot=" + fslot + "]";
	}
	
	
	
	

}

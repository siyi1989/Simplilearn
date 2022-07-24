package com.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class User {

	
	@Id
	private int userid;
	private String username;
	private String userpwd;
	private String ufirstname;
	private String ulastname;
	private String uaddress;
	private String uemail;
	private Date udate;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getUfirstname() {
		return ufirstname;
	}
	public void setUfirstname(String ufirstname) {
		this.ufirstname = ufirstname;
	}
	public String getUlastname() {
		return ulastname;
	}
	public void setUlastname(String ulastname) {
		this.ulastname = ulastname;
	}
	public String getUaddress() {
		return uaddress;
	}
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public Date getUdate() {
		return udate;
	}
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	public User(int userid, String username, String userpwd, String ufirstname, String ulastname, String uaddress,
			String uemail, Date udate) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpwd = userpwd;
		this.ufirstname = ufirstname;
		this.ulastname = ulastname;
		this.uaddress = uaddress;
		this.uemail = uemail;
		this.udate = udate;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	
	
}

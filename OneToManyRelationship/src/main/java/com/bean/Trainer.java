package com.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity
public class Trainer {

@Id
	private int tid;
	private String tname;
	private String tech;
	//private Students student; // one to one
	
	//@OneToMany(mappedBy="Tsid") //if table already created in database, this code is used to link to foreign key
	@OneToMany(cascade=CascadeType.ALL) //through trainer object, user can save/update/delete student without individually save s1/s2 etc in DemoTest
	@JoinColumn(name="tsid",referencedColumnName="tid") // tsid=FK, tid=PK. this code used for database created from hibernate
	private List<Students>listOfStd;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public List<Students> getListOfStd() {
		return listOfStd;
	}
	public void setListOfStd(List<Students> listOfStd) {
		this.listOfStd = listOfStd;
	}
	public Trainer(int tid, String tname, String tech, List<Students> listOfStd) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tech = tech;
		this.listOfStd = listOfStd;
	}
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Trainer [tid=" + tid + ", tname=" + tname + ", tech=" + tech + ", listOfStd=" + listOfStd + "]";
	}
	
	
}

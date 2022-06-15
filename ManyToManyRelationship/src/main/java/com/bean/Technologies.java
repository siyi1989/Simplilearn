package com.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Technologies {

	@Id
	private int tid;
	private String tech;
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Employees> listOfEmp;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public List<Employees> getListOfEmp() {
		return listOfEmp;
	}
	public void setListOfEmp(List<Employees> listOfEmp) {
		this.listOfEmp = listOfEmp;
	}
	public Technologies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Technologies(int tid, String tech, List<Employees> listOfEmp) {
		super();
		this.tid = tid;
		this.tech = tech;
		this.listOfEmp = listOfEmp;
	}
	@Override
	public String toString() {
		return "Technologies [tid=" + tid + ", tech=" + tech + ", listOfEmp=" + listOfEmp + "]";
	}
	
}


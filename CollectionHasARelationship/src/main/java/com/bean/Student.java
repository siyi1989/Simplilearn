package com.bean;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;

@Entity
public class Student {
	
@Id
	private int sid;
	private String sname;
	
@ElementCollection //array or collection with primitive value
@CollectionTable(name="marks",joinColumns=@JoinColumn(name="sid"))
@OrderColumn(name="abc")
	private int marks[]; 
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, int[] marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	
	
}

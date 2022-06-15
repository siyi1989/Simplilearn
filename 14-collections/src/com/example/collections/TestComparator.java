package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

	//Comparator can use multiple sort from other classes
	public static void main(String[] args) {
		List<Student>studentList=new ArrayList<Student>();

		Comparator<Student> sortName=new StudentSortName();
		Comparator<Student> sortGpa=new StudentSortGpa();
		
		studentList.add(new Student("Thomas Jefferson",1,3.8));
		studentList.add(new Student("John Adams",2,3.9));
		studentList.add(new Student("George Washington",3,3.4));
		studentList.add(new Student("John Adams",4,3.0)); //duplicate added because not using TreeSet
	
		Collections.sort(studentList,sortName);
		for (Student student:studentList) {
			System.out.println(student);
		}
		
		System.out.println("************************");	
		
		Collections.sort(studentList,sortGpa);
		for (Student student:studentList) {
			System.out.println(student);
		}
	}
}

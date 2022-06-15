package com.example.collections;

import java.util.Set;
import java.util.TreeSet;

public class TestComparable {

	public static void main(String[] args) {
		//auto sorted
		Set<ComparableStudent> studentList=new TreeSet<ComparableStudent>();
		studentList.add(new ComparableStudent("Thomas Jefferson",1,3.8));
		studentList.add(new ComparableStudent("John Adams",2,3.9));
		studentList.add(new ComparableStudent("George Washington",3,3.4));
		studentList.add(new ComparableStudent("John Adams",4,3.0)); //duplicate not added

		for(ComparableStudent student:studentList) {
			System.out.println(student);
		}
	}

}

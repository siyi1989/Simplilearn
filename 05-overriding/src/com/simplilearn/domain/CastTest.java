package com.simplilearn.domain;

import com.simplilearn.domain.*;

public class CastTest {

	public static void main(String[] args) {
		
		//upward cast
		Employee e=new Manager(1,"John","111-11-1111",2000,"Marketing");
		
		//Manager m=e;
		if (e instanceof Manager) {
		Manager m=(Manager) e;
		//set dept name
		m.setDeptName("HR");
		System.out.println(m.getDetails());
		

	}

}
}

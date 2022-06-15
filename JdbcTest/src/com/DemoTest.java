package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DemoTest {
	
	public static void main(String[] args){
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded...");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn-demo","root","new_password");
		System.out.println("connected to database");
		Statement stmt=con.createStatement();
		//store records
//		int res=stmt.executeUpdate("insert into employee values(5,'siyi',12,'pass')");
//		if(res>0) {
//			System.out.println("record inserted success");
//		}
		
//		//insert record using prepared statement
//		Scanner sc=new Scanner(System.in);
//		PreparedStatement pstmt=con.prepareStatement("insert into employee values (?,?,?,?)");
//		System.out.println("Enter id");
//		int id=sc.nextInt();
//		pstmt.setInt(1,id);
//		
//		System.out.println("Enter name");
//		String name=sc.next();
//		pstmt.setString(2,name);
//		
//		System.out.println("Enter age");
//		float age=sc.nextFloat();
//		pstmt.setFloat(3,age);
//		
//		System.out.println("Enter password");
//		String pw=sc.next();
//		pstmt.setString(4,pw);
//		
//		int res=pstmt.executeUpdate();
//		if(res>0) {
//			System.out.println("Record insert success");
//		}
		
	

		
		
		//delete record
//		int res=stmt.executeUpdate("delete from employee where Eid=103");
//		if(res>0) {
//			System.out.println("record delete success");
//		}else {
//			System.out.println("record not present");
//		}
		
		
		
		//delete record using prepared statement
//		Scanner sc=new Scanner(System.in);
//		PreparedStatement pstmt=con.prepareStatement("delete from employee where Eid=?");
//		System.out.println("Enter id");
//		int id=sc.nextInt();
//		pstmt.setInt(1,id);
//		int res=pstmt.executeUpdate();
//		if(res>0) {
//			System.out.println("Record delete success");
//		}else {
//			System.out.println("Record not exist");
//		}

		
		//update record
//		int res=stmt.executeUpdate("update employee set Age=3 where Eid=115");
//		if(res>0) {
//			System.out.println("record update success");
//		}else {
//			System.out.println("record not present");
//		}
		
		
		//update record using prepared statement
//		Scanner sc=new Scanner(System.in);
//		PreparedStatement pstmt=con.prepareStatement("update employee set Age=? where Eid=?");
//		
//		System.out.println("Enter id");
//		int id=sc.nextInt();
//		pstmt.setInt(2,id); // referring to second ? field. not referring to col number
//		
//		System.out.println("Enter Age");
//		float age=sc.nextFloat();
//		pstmt.setFloat(1,age); // referring to first ? field. not referring to col number
//		
//		
//		int res=pstmt.executeUpdate();
//		if(res>0) {
//			System.out.println("Record update success");
//		}else {
//			System.out.println("Record not exist");
//		}
		
		
		//retrieve record
//		ResultSet rs=stmt.executeQuery("select * from employee");
//		while(rs.next()) {
//			System.out.println("Id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Age is "+rs.getInt(3)+" Password is "+rs.getString(4));
//		}
		
		
		//retrieve using prepared statement
		PreparedStatement pstmt=con.prepareStatement("select * from employee");
		ResultSet rs=pstmt.executeQuery("select * from employee");
		while(rs.next()) {
			System.out.println("Id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Age is "+rs.getInt(3)+" Password is "+rs.getString(4));
		}		
		
		
		
//		
//		stmt.close();
//		con.close();
		
		pstmt.close();
		con.close();
		
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}

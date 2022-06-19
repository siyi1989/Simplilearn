package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.bean.Airlines;
import com.resource.DbResource;

public class AirlineDao {

	public int storeAirline(Airlines lairl) {
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("Insert into airlines(lairline) values (?)");
			pstmt.setString(1,lairl.getLairline());
			
			int res=pstmt.executeUpdate();
			return res;
		}catch (Exception e) {
			System.out.println(e);
			return 0;
				
				
		}
		}
	
	public List<Airlines> getAllAirlineDetails(){
		List<Airlines> listOfAirline=new ArrayList<Airlines>();
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("Select * from airlines");
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {

				Airlines airline=new Airlines();
				airline.setLairline(rs.getString(1));
				listOfAirline.add(airline);
				
				}
			}catch (Exception e) {
				System.out.println(e);
			
			}
			return listOfAirline;
		}
		
	}
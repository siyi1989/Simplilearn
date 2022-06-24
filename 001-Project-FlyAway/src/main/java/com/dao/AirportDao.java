package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Airports;
import com.resource.DbResource;

public class AirportDao {

	public int storeAirport(Airports airport) {
		try {
				
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("Insert into airports(airport,ccountry) values (?,?)");
			pstmt.setString(1,airport.getAirport());
			pstmt.setString(2,airport.getccountry());
			
			int res=pstmt.executeUpdate();
			return res;
		}catch (Exception e) {
			System.out.println(e);
			return 0;
				
					
		}
		
	}
	
	public List<Airports> getAllAirportDetails() {
		List<Airports> listOfAirport=new ArrayList<Airports>();
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("Select * from airports order by airport");
						
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {

				Airports port=new Airports();
				port.setAirport(rs.getString(1));
				port.setccountry(rs.getString(2));
				listOfAirport.add(port);
				
			}
		}catch (Exception e) {
			System.out.println(e);
		
		}
		return listOfAirport;
	}
	
	public List<Airports> getSelectedAirportDetails(String inputairport) {
		List<Airports> listOfSelectedAirport=new ArrayList<Airports>();
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("Select ccountry from airports where airport=?");
			
			pstmt.setString(1,inputairport);
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {

				Airports port=new Airports();
				port.setAirport(rs.getString(1));
				listOfSelectedAirport.add(port);
				
			}
		}catch (Exception e) {
			System.out.println(e);
		
		}
		return listOfSelectedAirport;
	}
	

	
}
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
import org.hibernate.cfg.Configuration;

import com.bean.Airports;
import com.resource.DbResource;

public class AirportDao {

	public int storeAirport(Airports airport) {
//		try {
//			
//			
//			Connection con=DbResource.getDbConnection();
//			PreparedStatement pstmt=con.prepareStatement("Insert into airports(airport,acountry) values (?,?)");
//			pstmt.setString(1,airport.getAirport());
//			pstmt.setString(2,airport.getAcountry());
//
//			int res=pstmt.executeUpdate();
//			return res;
//		}catch (Exception e) {
//			System.out.println(e);
//			return 0;
//				
//					
//		}
		
		try {
			Configuration con=new Configuration();
			con.configure("hibernate.cfg.xml"); //load database details
			SessionFactory sf=con.buildSessionFactory();//connection in jdbc
			Session session=sf.openSession(); //statemnt and preparedstmt
			Transaction tran=session.getTransaction(); //only required if modifying data, not required for query
			tran.begin();
			session.save(airport);
			tran.commit();
			return 1;
		}catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public List<Airports> getAllAirportDetails() {
		List<Airports> listOfAirport=new ArrayList<Airports>();
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("Select * from airports");
						
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {

				Airports port=new Airports();
				port.setAirport(rs.getString(1));
				port.setAcountry(rs.getString(2));
				listOfAirport.add(port);
				
			}
		}catch (Exception e) {
			System.out.println(e);
		
		}
		return listOfAirport;
	}
	
	public List<Airports> getSelectedAirportDetails(String inputcountry) {
		List<Airports> listOfSelectedAirport=new ArrayList<Airports>();
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("Select airport from airports where acountry=?");
			
			pstmt.setString(1,inputcountry);
			
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
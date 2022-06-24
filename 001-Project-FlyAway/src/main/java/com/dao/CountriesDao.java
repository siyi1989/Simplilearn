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
import org.hibernate.query.Query;

import com.bean.Countries;
import com.resource.DbResource;

public class CountriesDao {

	
	public List<Countries> getAllCountries(){
		List<Countries> listOfCountries=new ArrayList<Countries>();
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("Select * from countries order by ccountry");
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {

				Countries country=new Countries();
				country.setCcountry(rs.getString(1));
				listOfCountries.add(country);
				
				}
			}catch (Exception e) {
				System.out.println(e);
			
			}
			return listOfCountries;
		}
		
	public int storeCountries(Countries country) {
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("Insert into countries(ccountry) values (?)");
			pstmt.setString(1,country.getCcountry());
			
			int res=pstmt.executeUpdate();
			return res;
		}catch (Exception e) {
			System.out.println(e);
			return 0;
				
				
		}
		}
	}
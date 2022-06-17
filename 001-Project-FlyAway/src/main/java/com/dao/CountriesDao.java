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

import com.bean.Countries;
import com.resource.DbResource;

public class CountriesDao {

	
	public List<Countries> getAllCountries(){
		List<Countries> listOfCountries=new ArrayList<Countries>();
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("Select * from countries");
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {

				Countries ctry=new Countries();
				ctry.setCcountry(rs.getString(1));
				listOfCountries.add(ctry);
				
				}
			}catch (Exception e) {
				System.out.println(e);
			
			}
			return listOfCountries;
		}
		
	}
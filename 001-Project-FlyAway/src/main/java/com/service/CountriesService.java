package com.service;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.bean.Countries;
import com.bean.Product;
import com.dao.CountriesDao;

public class CountriesService {

	CountriesDao cd=new CountriesDao();
	
	public List<Countries> getAllCountries(){
		List<Countries>listOfCountry=cd.getAllCountries();
		Iterator<Countries> li=listOfCountry.iterator();
		while(li.hasNext()) {
			 Countries ctry=li.next();
		}
		
		return listOfCountry;
	}
	
}

	

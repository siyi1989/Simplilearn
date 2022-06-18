package com.service;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.bean.Countries;
import com.dao.CountriesDao;

public class CountriesService {

	CountriesDao cd=new CountriesDao();
	
	public List<Countries> getAllCountries(){
		List<Countries>listOfCountry=cd.getAllCountries();
		Iterator<Countries> li=listOfCountry.iterator();
		while(li.hasNext()) {
			 Countries country=li.next();
		}
		
		return listOfCountry;
	}
	
	public String storeCountries(Countries country) {
		if(cd.storeCountries(country)>0) {
			return "Country save success";
			
		}else {
			return "Country save fail.Check no duplicates";
		}

	}
	
}

	

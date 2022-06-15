package com.service;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.bean.Airlines;
import com.bean.Product;
import com.dao.AirlineDao;

public class AirlineService {

	AirlineDao ad=new AirlineDao();
	
	public List<Airlines> getAllAirline(){
		List<Airlines>listOfAirline=ad.getAllAirlineDetails();
		Iterator<Airlines> li=listOfAirline.iterator();
		while(li.hasNext()) {
			 Airlines air=li.next();
		}
		
		return listOfAirline;
	}
	
	public String storeAirline(Airlines air) {
		if(ad.storeAirline(air)>0) {
			return "Airline stored successfully";
			
		}else {
			return "Airline cannot be saved. Please ensure that it is not already in list.";
		}
	}
}

	

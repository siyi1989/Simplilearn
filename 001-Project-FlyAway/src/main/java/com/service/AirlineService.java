package com.service;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import com.bean.Airlines;
import com.dao.AirlineDao;

public class AirlineService {

	AirlineDao ad=new AirlineDao();
	
	public List<Airlines> getAllAirline(){
		List<Airlines>listOfAirline=ad.getAllAirlineDetails();
		Iterator<Airlines> li=listOfAirline.iterator();
		while(li.hasNext()) {
			 Airlines airline=li.next();
		}
		
		return listOfAirline;
	}
	
	public String storeAirline(Airlines air) {
		if(ad.storeAirline(air)>0) {
			return "Airline save success.";
			
		}else {
			return "Airline save failed.";
		}
	}
}

	

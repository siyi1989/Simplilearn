package com.service;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.bean.Airports;
import com.dao.AirportDao;

public class AirportService {

	AirportDao portd=new AirportDao();
	
	public String storeAirport(Airports airport) {
		if(portd.storeAirport(airport)>0) {
			return "Airport stored successfully";
			
		}else {
			return "Airport cannot be saved. Please ensure that it is not already in list.";
		}

	}
	
	public List<Airports> getAllAirport(){
		List<Airports>listOfAirport=portd.getAllAirportDetails();
		Iterator<Airports> li=listOfAirport.iterator();
		while(li.hasNext()) {
			Airports port=li.next();
		}
		
		return listOfAirport;
	}
	
	public List<Airports> getSelectedAirport(String inputcountry){
		List<Airports>listOfSelectedAirport=portd.getSelectedAirportDetails(inputcountry);
		Iterator<Airports> li=listOfSelectedAirport.iterator();
		while(li.hasNext()) {
			Airports port=li.next();
		}
		
		return listOfSelectedAirport;
	}
	
	
}

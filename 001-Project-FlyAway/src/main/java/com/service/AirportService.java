package com.service;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import com.bean.Airports;
import com.dao.AirportDao;

public class AirportService {

	AirportDao portd=new AirportDao();
	
	public String storeAirport(Airports airport) {
		if(portd.storeAirport(airport)>0) {
			return "Airport save success";
			
		}else {
			return "Airport save fail";
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
	
	public List<Airports> getSelected(String inputairport){
		List<Airports>listOfSelected=portd.getSelectedDetails(inputairport);
		Iterator<Airports> li=listOfSelected.iterator();
		while(li.hasNext()) {
			Airports port=li.next();
		}
		
		return listOfSelected;
	}
	
}

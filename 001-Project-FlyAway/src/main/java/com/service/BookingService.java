package com.service;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.bean.Booking;
import com.dao.BookingDao;

public class BookingService {

	BookingDao bd=new BookingDao();
	
	public String storeBooking(Booking book) {
		if(bd.storeBooking(book)>0) {
			return "Data stored successfully";				
		}else {
		return  "Data not stored. Please ensure all fields are completed and try again";
	}
	}
}
package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bean.Booking;
import com.resource.DbResource;

public class BookingDao {

	public int storeBooking(Booking book) {
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("Insert into booking(bdate,bsource,bsourceport,bdestination,bdestport,bairline,bslot,bprice,bss,bsstime,bpaid,bfid) values (?,?,?,?,?,?,?,?,?,?,?,?)");
			pstmt.setDate(1,book.getBdate());
			pstmt.setString(2,book.getBsource());
			pstmt.setString(3,book.getBsourceport());
			pstmt.setString(4,book.getBdestination());
			pstmt.setString(5,book.getBdestport());
			pstmt.setString(6,book.getBairline());
			pstmt.setInt(7,book.getBslot());
			pstmt.setFloat(8,book.getBprice());
			pstmt.setString(9,book.getBss());
			pstmt.setDate(10,book.getBsstime());
			pstmt.setFloat(11,book.getBpaid());
			pstmt.setInt(12,book.getBfid());
			
			int res=pstmt.executeUpdate();
			return res;
		}catch (Exception e) {
			System.out.println(e);
			return 0;
				
					
		}

	}
}
package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import com.bean.Product;
import com.resource.DbResource;

public class ProductDao {

	public int storeProduct(Product product) {
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("Insert into flights(fdate,fsource,fsourceport,fdestination,fdestport,fairline,fslot,fprice) values (?,?,?,?,?,?,?,?)");
			pstmt.setObject(1,product.getFdate());
			pstmt.setString(2,product.getFsource());
			pstmt.setString(3,product.getFsourceport());
			pstmt.setString(4,product.getFdestination());
			pstmt.setString(5,product.getFdestport());
			pstmt.setString(6,product.getFairline());
			pstmt.setInt(7,product.getFslot());
			pstmt.setFloat(8,product.getFprice());
			
			int res=pstmt.executeUpdate();
			return res;
		}catch (Exception e) {
			System.out.println(e);
			return 0;
				
					
		}
	}
	
	public List<Product> getSelectedProductDetails(Product product,Object fromDate,Object toDate) {
		List<Product> listOfProduct=new ArrayList<Product>();
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("Select * from flights where fslot<>0 and fsource in(?) and fdestination in(?) and fdate between"+ fromDate +" and "+toDate);
			pstmt.setString(1,product.getFsource());
			pstmt.setString(2,product.getFdestination());
			pstmt.setObject(3,fromDate);
			pstmt.setObject(4,toDate);
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {

				Product p=new Product();
				p.setFid(rs.getInt(1));
				p.setFdate(rs.getObject(2));
				p.setFsource(rs.getString(3));
				p.setFsourceport(rs.getString(4));
				p.setFdestination(rs.getString(5));
				p.setFdestport(rs.getString(6));
				p.setFairline(rs.getString(7));
				p.setFprice(rs.getFloat(8));
				p.setFslot(rs.getInt(9));
				listOfProduct.add(p);
				
			}
		}catch (Exception e) {
			System.out.println(e);
		
		}
		return listOfProduct;
	}
	
	public List<Product> confirmProduct(Product product,int searchid) {
		List<Product> listOfProduct=new ArrayList<Product>();
		
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("select * from flights where fid=?");
			pstmt.setInt(1,searchid);
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {

				Product p=new Product();
				p.setFid(rs.getInt(1));
				p.setFdate(rs.getObject(2));
				p.setFsource(rs.getString(3));
				p.setFsourceport(rs.getString(4));
				p.setFdestination(rs.getString(5));
				p.setFdestport(rs.getString(6));
				p.setFairline(rs.getString(7));
				p.setFprice(rs.getFloat(8));
				p.setFslot(rs.getInt(9));
				listOfProduct.add(p);
				
			}
		}catch (Exception e) {
			System.out.println(e);
		
		}
		return listOfProduct;
	}
	
	public List<Product> getAllProductDetails() {
		List<Product> listOfProduct=new ArrayList<Product>();
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("Select * from flights");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
			//below system print stmt is used to print directly in servlet and cannot be used for printing in web	
			//System.out.println("pid is" +rs.getInt(1)+"Pname is "+rs.getString(2)+"Price"+rs.getFloat(3));
			
				//below code is used to create new product object for each product and print in web
				Product p=new Product();
				p.setFid(rs.getInt(1));
				p.setFdate(rs.getObject(2));
				p.setFsource(rs.getString(3));
				p.setFsourceport(rs.getString(4));
				p.setFdestination(rs.getString(5));
				p.setFdestport(rs.getString(6));
				p.setFairline(rs.getString(7));
				p.setFprice(rs.getFloat(8));
				p.setFslot(rs.getInt(9));
				listOfProduct.add(p);
				
			}
		}catch (Exception e) {
			System.out.println(e);
		
		}
		return listOfProduct;
	}
}
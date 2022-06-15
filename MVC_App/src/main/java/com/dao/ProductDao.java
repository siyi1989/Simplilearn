package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Product;
import com.resource.DbResource;

public class ProductDao {

	public int storeProduct(Product product) {
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("insert into product values(?,?,?)");
			pstmt.setInt(1,product.getPid());
			pstmt.setString(2,product.getPname());
			pstmt.setFloat(3,product.getPrice());
			int res=pstmt.executeUpdate();
			return res;
		}catch (Exception e) {
			System.out.println(e);
			return 0;
				
					
		}
	}
	
	public List<Product> getAllProductDetails() {
		List<Product> listOfProduct=new ArrayList<Product>();
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("Select * from product");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
			//below system print stmt is used to print directly in servlet and cannot be used for printing in web	
			//System.out.println("pid is" +rs.getInt(1)+"Pname is "+rs.getString(2)+"Price"+rs.getFloat(3));
			
				//below code is used to create new product object for each product and print in web
				Product p=new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPrice(rs.getFloat(3));
				listOfProduct.add(p);
				
			}
		}catch (Exception e) {
			System.out.println(e);
		
		}
		return listOfProduct;
	}
}
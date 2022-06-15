package com.service;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.bean.Product;
import com.dao.ProductDao;

public class ProductService {

	ProductDao pd=new ProductDao();
	
	public String storeProduct(Product product) {
		if(product.getFprice()<=0) {
			return "Price of flight must be more than $0";
			
		}else if(pd.storeProduct(product)>0) {
			return "Flight details stored successfully";
			
		}else {
			return "Flight details cannot be saved. Please try again later.";
		}
	}
	
	public List<Product> getAllProduct(Product product,Date fromDate,Date toDate){
		List<Product>listOfProduct=pd.getAllProductDetails(product,fromDate,toDate);
		Iterator<Product> li=listOfProduct.iterator();
		while(li.hasNext()) {
			Product p=li.next();
		}
		
		return listOfProduct;
	}
	
	
}

package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Product;
import com.dao.ProductDao;

public class ProductService {

	ProductDao pd=new ProductDao();
	
	public String storeProduct(Product product) {
		if(product.getPrice()<1000) {
			return "Prod price must be >=$1000";
			
		}else if(pd.storeProduct(product)>0) {
			return "Prod details stored successfully";
			
		}else {
			return "Prod details did not store";
		}
	}
	
	public List<Product> getAllProductDetails(){
		List<Product>listOfProduct=pd.getAllProductDetails();
		Iterator<Product> li=listOfProduct.iterator();
		while(li.hasNext()) {
			Product p=li.next();
			p.setPrice(p.getPrice()-200); //price can be with or without condition
		}
		
		return listOfProduct;
	}
	
	
}

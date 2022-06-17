package com.service;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.bean.Product;
import com.dao.ProductDao;

public class ProductService {

	ProductDao pd=new ProductDao();
	
	public String storeProduct(Product product) {
		if(pd.storeProduct(product)>0) {
			return "Data stored successfully";				
		}else {
		return  "Data not stored. Please ensure all fields are completed and try again";
	}
	}
	
	public List<Product> getSelectedProduct(Product product,Date fromDate,Date toDate){
		List<Product>listOfSelectedProduct=pd.getSelectedProductDetails(product,fromDate,toDate);
		Iterator<Product> li=listOfSelectedProduct.iterator();
		while(li.hasNext()) {
			Product p=li.next();
		}
		
		return listOfSelectedProduct;
	}
	
	public String confirmProduct(Product product,int searchid) {
		if(product.getFid()==searchid ){
			return "Flight details search successfully";
			
		}else {
			return "Flight details cannot be found.Please search again";
		}
	}
	
	public List<Product> getAllProductDetails(){
		List<Product>listOfProduct=pd.getAllProductDetails();
		Iterator<Product> li=listOfProduct.iterator();
		while(li.hasNext()) {
			Product p=li.next();
		}
		
		return listOfProduct;
	}

	}
	

package com.service;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import com.bean.Product;
import com.dao.ProductDao;

public class ProductService {

	ProductDao pd=new ProductDao();
	
	public String storeProduct(Product product) {
		if(product.getFslot()<=0 | product.getFprice()<=0) {
			return "Validation fail. Check that slot and price must be more than zero";
		}else if (product.getFdestport().equals(product.getFsourceport())) {
			return "Validation fail. Check that airport to and form are different";
		}else if(pd.storeProduct(product)>0) {
			return "Flight details saved.";				
		}else {
		return  "Flight details fail to save.";
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
	

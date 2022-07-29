package com.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.bean.Product;
import com.dao.ProductDao;


@Service
@Component
public class ProductService {
	
	@Autowired
	ProductDao productDao;
	
	
	@Transactional
	public String insertNewProductDetails(Product prod) {
		if(productDao.insertNewProduct(prod)>0) {
			return "Success";
		}else {
			return "Product not inserted into records. Please try again";
						
		}
}
	
	@Transactional
	public List<Product>getAllProduct() {
		return productDao.getAllProduct();
}
	
	@Transactional
	public String updateQty(Product prod) {
			if(productDao.updateQty(prod)>0) {
				return "success";
			}else {
				return "Not sufficient ";
		}
	}
	
	@Transactional
	public String UpdateProductInfo(Product prod,Integer newqty) {
		Integer oldQty=productDao.findProductQty(prod.getProdid());
		if(oldQty==0) {
			return "Out of Stock";
			
		}else if(oldQty<newqty) {
				return "No sufficient stock. Remaining qty:"+oldQty;
			}else {
				if(productDao.updateQty(prod)>0) {
				return "Success";
			}else {
				
				return "Prod qty update failed";
			}
			}
		
		}
	
	@Transactional
	public String deleteProductInfo(int id) {
		if(productDao.deleteProdInfo(id)>0) {
			return "Success";
		}else {
			return "Product failed to be deleted.";
			
		}
	}
	
	@Transactional
	public List<Product>getSelectedProduct(Product prod) {
		return productDao.getSelProduct(prod);
}
	@Transactional
	public List<Product>getSelectedCatProduct(Product prod) {
		return productDao.getSelCatProduct(prod);
}
	
}


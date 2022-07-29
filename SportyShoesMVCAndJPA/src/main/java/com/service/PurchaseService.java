package com.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import com.bean.Purchase;
import com.dao.PurchaseDao;

@Service
@Component
public class PurchaseService {
	
	@Autowired
	PurchaseDao purchaseDao;
	
	
	@Transactional
	public String insertNewPurchaseDetails(Purchase pur) {
		if(purchaseDao.insertNewPurchase(pur)>0) {
			return "Success";
		}else {
			return "Purchase not inserted into cart. Please try again";
						
		}
}
	
	@Transactional
	public List<Purchase>getAllPurchase() {
		return purchaseDao.getAllPurchase();
}
	
	
	@Transactional
	public String deletePurchaseInfo(int id) {
		if(purchaseDao.deletePurInfo(id)>0) {
			return "Purchase record deleted successfully";
		}else {
			return "Purchase does not exist";
			
		}
	}
	
	@Transactional
	public List<Purchase>getSelectedIdPurchase(Purchase pur) {
		return purchaseDao.getSelIdPurchase(pur);
}
	@Transactional
	public List<Purchase>getSelectedDatePurchase(Purchase pur,Date startdate,Date enddate) {
		return purchaseDao.getSelDatePurchase(pur, startdate, enddate);
}
	
}


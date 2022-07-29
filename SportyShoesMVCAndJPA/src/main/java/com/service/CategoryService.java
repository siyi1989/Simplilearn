package com.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.bean.Category;
import com.dao.CategoryDao;


@Service
@Component
public class CategoryService {
	
	@Autowired
	CategoryDao catDao;
	
	
	@Transactional
	public String insertNewCatDetails(Category cat) {
		if(catDao.insertNewCategory(cat)>0) {
			return "Success";
		}else {
			return "Category not inserted into records. Please try again";
						
		}
}
	
	@Transactional
	public List<Category>getAllCategory() {
		return catDao.getAllCategory();
}
	
	
	@Transactional
	public String deleteCategoryInfo(int id) {
		if(catDao.deleteCatInfo(id)>0) {
			return "Category record deleted successfully";
		}else {
			return "Category does not exist";
			
		}
	}
	
	 @Transactional
		public Category getCategoryById(long id) {
		 	return catDao.getCategoryById(id);
		}

	
}


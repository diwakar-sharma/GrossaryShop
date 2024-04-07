package com.grossaryshop.service;

import java.util.ArrayList;

import com.grossaryshop.model.Grocery;


public interface GroceryService {
	 ArrayList<Grocery> findAllGrocery(); 
	 Grocery findAllGroceryByID(long id); 
	 Grocery findByName(String name); 
	   // void addGrocery(Grocery grocery); 
	    void deleteAllData();
		void saveGrocery(Grocery grocery); 
}

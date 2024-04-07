package com.grossaryshop.service;

import java.util.ArrayList;

import com.grossaryshop.model.User;

public interface UserService {
	 ArrayList<User> findAllUser(); 
	 User findAllUserByID(long id); 
//	    void addUser(); 
	    void deleteAllData();
		void addUser(User user); 
}

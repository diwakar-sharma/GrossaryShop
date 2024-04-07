package com.grossaryshop.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grossaryshop.model.User;
import com.grossaryshop.repository.UserRepository;
//http://localhost:8080/adduser
@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	    UserRepository userRepository; 
	
	@Override
	public ArrayList<User> findAllUser() {
		// TODO Auto-generated method stub
		return (ArrayList<User>) userRepository.findAll();
		
	}

	@Override
	public User findAllUserByID(long id) {
		Optional<User> opt = userRepository.findById(id);
        if (opt.isPresent()) 
            return opt.get(); 
        else
            return null; 
		
	}

	@Override
	public void addUser(User user) {
		try {
	    	System.out.println("01"+user);
        	userRepository.save(user); 
        	System.out.println("02"+user);
    	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteAllData() {
		userRepository.deleteAll(); 

	}

}



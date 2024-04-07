package com.grossaryshop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.grossaryshop.model.Grocery;
import com.grossaryshop.model.User;
import com.grossaryshop.service.GroceryServiceImpl;
import com.grossaryshop.service.UserServiceImpl;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class GroceryShopController {

	@Autowired
	UserServiceImpl userServiceImpl;
	@Autowired
	GroceryServiceImpl groceryServiceImpl;
///http://localhost:8080/saveuser/{conextuserid}
	//http://localhost:8080/saveuser/1
	
	@PostMapping("/saveuser/{conextuserid}") 
	public void saveUser(@PathVariable long conextuserid,@RequestBody User user) throws Exception { 
		User contuser = userServiceImpl.findAllUserByID(conextuserid); 
		if(contuser.getUserrole().equalsIgnoreCase("Admin"))
			userServiceImpl.addUser(user); 
		else 
			throw new Exception ("Not Allowed");
	} 

	//http://localhost:8080/saveGrocery/1
	@PostMapping("/saveGrocery/{conextuserid}") 
	public void saveGrocery(@PathVariable long conextuserid,@RequestBody Grocery grocery ) { 
		User contuser = userServiceImpl.findAllUserByID(conextuserid); 
		if(contuser.getUserrole().equalsIgnoreCase("Admin")) {
			System.out.println(grocery);
			String name= grocery.getName();
			Grocery grocery1 = groceryServiceImpl.findByName(name);
			if(grocery1!=null) {
				grocery1.setPricerate(grocery.getPricerate());
				grocery1.setQuantity(grocery1.getQuantity()+grocery.getQuantity());
				groceryServiceImpl.saveGrocery(grocery1); 
			} else {
				groceryServiceImpl.saveGrocery(grocery);
			}

		}
	}
	
	
	@PostMapping("/bookGroceryOrder/{conextuserid}") 
	public void booking(@PathVariable long conextuserid,@RequestBody List<Grocery> grocerylist ) { 
			groceryServiceImpl.bookorder(conextuserid,grocerylist);
	} 



	@GetMapping("/findallGrocery") 
	public ArrayList<Grocery> getAllGrocery() { 
		return groceryServiceImpl.findAllGrocery(); 
	} 
	
	@GetMapping("/findallUser") 
	public ArrayList<User> getAllUser() { 
		return userServiceImpl.findAllUser(); 
	} 

	@GetMapping("/findbyid/{id}") 
	public User getEmployeeUsingId(@PathVariable long id) { 
		return userServiceImpl.findAllUserByID(id); 
	} 

	@DeleteMapping("/delete") 
	public void delete() { 
		userServiceImpl.deleteAllData(); 
	} 
}

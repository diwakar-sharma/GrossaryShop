package com.grossaryshop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grossaryshop.model.BookedItem;
import com.grossaryshop.model.Grocery;
import com.grossaryshop.model.Order;
import com.grossaryshop.model.User;
import com.grossaryshop.repository.BookedItemRepository;
import com.grossaryshop.repository.GroceryRepository;
import com.grossaryshop.repository.OrderRepository;
import com.grossaryshop.repository.UserRepository;
//http://localhost:8080/adduser
@Service("GroceryService")
public class GroceryServiceImpl implements GroceryService{

	@Autowired
	GroceryRepository groceryRepository;

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	BookedItemRepository bookedItemRepository;

	@Override
	public void deleteAllData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Grocery> findAllGrocery() {
		return (ArrayList<Grocery>) groceryRepository.findAll();
	}

	@Override
	public Grocery findAllGroceryByID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public void saveGrocery(Grocery grocery) {
		groceryRepository.save(grocery);
		
	}

	@Override
	public Grocery findByName(String name) {
		Grocery  grocery = groceryRepository.findByName(name);
		return grocery;
	}

	public void bookorder(long conextuserid, List<Grocery> grocerylist) {
		Order order  =  new Order(conextuserid,0);
		orderRepository.save(order);
		
		int total =  0 ;
		for (int i =0 ; i <grocerylist.size(); i++) {
			Grocery grocery = grocerylist.get(i);
			total += grocery.getPricerate()*grocery.getQuantity();
			BookedItem bookedItem =new BookedItem(grocery.getId(),order.getOrderid(),grocery.getQuantity(),grocery.getPricerate()*grocery.getQuantity());
			bookedItemRepository.save(bookedItem );
		}
		order.setAmount(total);
		orderRepository.save(order);
	} 
	

}



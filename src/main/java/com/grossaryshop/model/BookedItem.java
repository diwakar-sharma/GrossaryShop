package com.grossaryshop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BookedItem")
public class BookedItem {
/*
 *
 */
	
	 @Id   
	 @GeneratedValue(strategy = GenerationType.AUTO)  
	 	private long id; 
	    private long groceryid; 
	    private long orderid;
	    private int qty;
	    private int value;
	  
	    
	    public BookedItem() { 
	        super(); 
	    }


		public BookedItem(long groceryid, long orderid, int qty, int value) {
			super();
			this.groceryid = groceryid;
			this.orderid = orderid;
			this.qty = qty;
			this.value = value;
		}


		public long getGroceryid() {
			return groceryid;
		}


		public void setGroceryid(long groceryid) {
			this.groceryid = groceryid;
		}


		public long getOrderid() {
			return orderid;
		}


		public void setOrderid(long orderid) {
			this.orderid = orderid;
		}


		public int getQuantity() {
			return qty;
		}


		public void setQuantity(int qty) {
			this.qty = qty;
		}


		public int getValue() {
			return value;
		}


		public void setValue(int value) {
			this.value = value;
		}


		public long getId() {
			return id;
		}


		@Override
		public String toString() {
			return "BookedItem [id=" + id + ", groceryid=" + groceryid + ", orderid=" + orderid + ", quantity="
					+ qty + ", value=" + value + "]";
		}
	    
	    	
		
		 
	
}

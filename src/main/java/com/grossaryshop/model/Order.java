package com.grossaryshop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="OrderTable")
public class Order {
/*
 * id 
 */
	
	 @Id   
	 @GeneratedValue(strategy = GenerationType.AUTO)  
	 	private long orderid; 
	    private long userid; 
	    private int amount;
	  
	    
	    public Order() { 
	        super(); 
	    }


		public Order(long userid, int amount) {
			super();
			this.userid = userid;
			this.amount = amount;
		}


		public long getUserid() {
			return userid;
		}


		public void setUserid(long userid) {
			this.userid = userid;
		}


		public int getAmount() {
			return amount;
		}


		public void setAmount(int amount) {
			this.amount = amount;
		}


		public long getOrderid() {
			return orderid;
		}
	    
	   
}

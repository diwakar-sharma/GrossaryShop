package com.grossaryshop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Grocery")
public class Grocery {
/*
 * id int not null primary key auto_increment,
 */
	
	 @Id   
	 @GeneratedValue(strategy = GenerationType.AUTO)  
	 	private long id; 
	    private String name; 
	    private int qty;
	    private int rate;
	  
	    
	    public Grocery() { 
	        super(); 
	    }


		public long getId() {
			return id;
		}

		@Override
		public String toString() {
			return "Grocery [id=" + id + ", name=" + name + ", quantity=" + qty + ", rate=" + rate + "]";
		}


		public Grocery(String name, int qty, int rate) {
			super();
			this.name = name;
			this.qty = qty;
			this.rate = rate;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getQuantity() {
			return qty;
		}


		public void setQuantity(int qty) {
			this.qty = qty;
		}


		public int getPricerate() {
			return rate;
		}


		public void setPricerate(int rate) {
			this.rate = rate;
		}
}

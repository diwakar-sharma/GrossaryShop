package com.grossaryshop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User {
/*
 * id int not null primary key auto_increment,
username nvarchar(50) not null,
userrole nvarchar(50) not null,
address nvarchar(50) 
 */
	
	 @Id   
	 @GeneratedValue(strategy = GenerationType.AUTO)  
	 private long id; 
	
		private String username; 
	    private String userrole;
	    private String address;
	  
	    
	    public User() { 
	        super(); 
	    }
	    
	    public User(String username, String userrole, String address) {
			super();
			this.username = username;
			this.userrole = userrole;
			this.address = address;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		

		public String getUserrole() {
			return userrole;
		}

		public void setUserrole(String userrole) {
			this.userrole = userrole;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

	    public long getId() {
			return id;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", username=" + username + ", userrole=" + userrole + ", address=" + address+ "]";
		} 
	
		
		 
	
}

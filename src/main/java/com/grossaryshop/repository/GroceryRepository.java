package com.grossaryshop.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.grossaryshop.model.Grocery;

@Repository 
public interface GroceryRepository extends JpaRepository<Grocery, Long>{
	@Query("select u from Grocery u where u.name = ?1")
	Grocery findByName(String name);
}
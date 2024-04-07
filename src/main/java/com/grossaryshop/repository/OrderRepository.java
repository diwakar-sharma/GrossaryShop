package com.grossaryshop.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grossaryshop.model.Grocery;
import com.grossaryshop.model.Order;

@Repository 
public interface OrderRepository extends JpaRepository<Order, Long>{

}
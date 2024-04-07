package com.grossaryshop.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grossaryshop.model.BookedItem;
import com.grossaryshop.model.Grocery;

@Repository 
public interface BookedItemRepository extends JpaRepository<BookedItem, Long>{

}
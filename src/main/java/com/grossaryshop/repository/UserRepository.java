package com.grossaryshop.repository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grossaryshop.model.User;

@Repository 
public interface UserRepository extends JpaRepository<User, Long>{

}
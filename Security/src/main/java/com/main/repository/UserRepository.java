package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
	
	Users findByUserName(String username);

}

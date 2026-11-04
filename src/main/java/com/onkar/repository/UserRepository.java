package com.onkar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onkar.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	public boolean existsByEmail(String email);
	
	public User findByEmail(String email);
	
}

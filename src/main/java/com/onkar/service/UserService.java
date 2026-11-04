package com.onkar.service;

import com.onkar.entity.User;

public interface UserService {

	public User saveUser(User user);
	
	public boolean existEmailCheck(String email);
	
}

package com.ecommerce.platform.service;

import java.util.List;

import com.ecommerce.platform.model.Users;

public interface UserService 
{
	Users registerUser(Users user);
	List<Users> getAllusers();
	Users getUserbyId(Long Id);
	 void deletUser(Long Id);
	 

}

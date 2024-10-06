package com.ecommerce.platform.servicImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecommerce.platform.model.Users;
import com.ecommerce.platform.service.UserService;
import com.ecommerce.platform.userrepository.UserRepository;

public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userrepository;
	
	@Override
	public Users registerUser(Users user) {
		userrepository.save(user);
		return user;
	}

	@Override
	public List<Users> getAllusers() {
		
		return userrepository.findAll();
	}

	@Override
	public Users getUserbyId(Long Id) {
		return userrepository.findById(Id).orElseThrow();
	}

	@Override
	public void deletUser(Long Id) {
		userrepository.deleteById(Id);
	}

}

package com.ecommerce.platform.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.platform.model.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

}

package com.richardbeletatti.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.richardbeletatti.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}

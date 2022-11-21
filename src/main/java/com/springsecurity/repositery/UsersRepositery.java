package com.springsecurity.repositery;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.model.User;

@Repository
public interface UsersRepositery extends JpaRepository<User,Integer>{

	 public Optional<User> findByUsername(String username);
}

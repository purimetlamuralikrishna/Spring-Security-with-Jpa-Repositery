package com.springsecurity.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springsecurity.model.User;
import com.springsecurity.repositery.UsersRepositery;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	UsersRepositery userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		 Optional<User> user = userRepository.findByUsername(username);
         
	        if (user.isEmpty()) {
	            throw new UsernameNotFoundException("Could not find user");
	        }
	        return new MyUserDetails(user.get());
	} 
	

}

package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.main.model.UserPrincipal;
import com.main.model.Users;
import com.main.repository.UserRepository;

@Service
public class MyUserDetailService implements UserDetailsService {
	
	@Autowired
	private UserRepository userrepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Users user = userrepository.findByUserName(username);
		
		if(user==null) {
			System.out.println("User not found");
			throw new UsernameNotFoundException("User not found");
			
		}
		
		return new UserPrincipal(user);
	}

}

package com.main.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Autowired
	private UserDetailsService userdetailsservice;
	
//	we are using AuthenticationProvider to define our own security configurations
//	as AuthenticationProvider is an interface so we want a class that implements it so as to create an object
//	there are multiple AuthenticationProviders and one of them is for database known as DAOAuthenticationProvider
	@Bean
	AuthenticationProvider authenticationprovider() {
		DaoAuthenticationProvider daoauthenticationprovider =  new DaoAuthenticationProvider();
		daoauthenticationprovider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		daoauthenticationprovider.setUserDetailsService(userdetailsservice);
		return daoauthenticationprovider;
	}

}

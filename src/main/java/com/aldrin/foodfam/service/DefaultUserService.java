package com.aldrin.foodfam.service;

import com.aldrin.foodfam.dto.UserRegisteredDTO;
import com.aldrin.foodfam.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;




public interface DefaultUserService extends UserDetailsService{

	User save(UserRegisteredDTO userRegisteredDTO);




	
}

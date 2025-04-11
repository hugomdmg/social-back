package com.api.social.service;

import org.springframework.stereotype.Service;

import com.api.social.repository.UserRepository;
import com.api.social.model.*;
import java.util.*;

@Service
public class UserService {
	
	private UserRepository userRepository;
	
	UserService(UserRepository userRepository){
		this.userRepository = userRepository;
	}
	
	public List<User> getUsers(){
		return this.userRepository.findAll();
	}
	
	public User createUser(User user){
		return this.userRepository.save(user);
	}
	public User loginUser(User user) {
	    Optional<User> foundUser = userRepository.findByEmail(user.getEmail());

	    if (foundUser.isPresent() &&
	    		user.getPassword().equals(foundUser.get().getPassword())
	    				) {
	        return foundUser.get();
	    }

	    return user;
	}
	
	public User getUserById(Id data) {
		Optional<User> foundUser = userRepository.findById(data.getId());
		return foundUser.get();
	}

}

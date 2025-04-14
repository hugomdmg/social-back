package com.api.social.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.social.model.*;
import com.api.social.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"http://localhost:4200", "social-flame-pi.vercel.app"})

public class UserController {
	
	private UserService userService;
	
	UserController(UserService userService){
		this.userService = userService;
		
	}

	@GetMapping("/get-all")
	public List<User> getAllUsers() {
		return this.userService.getUsers();
	}
	
	@PostMapping("/save")
	public User createUser(@RequestBody User user) {
		return this.userService.createUser(user);
	}
	
	@PostMapping("/login")
	public User loginUser(@RequestBody User credentials) {
		return this.userService.loginUser(credentials);
	}
	
	@PostMapping("/user-id")
	public User getUserById(@RequestBody Id data) {
		System.out.print("--------------");
		System.out.print(data);
		return this.userService.getUserById(data);
	}
	

}

package com.ufrn.imd.encontrei.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ufrn.imd.encontrei.model.User;
import com.ufrn.imd.encontrei.repository.Users;

@RestController
public class UserResource {
	
	@Autowired
	Users users;
	
	@PostMapping("/user")
	public User newUser(@RequestBody User user) {
		return users.save(user);
	}
}

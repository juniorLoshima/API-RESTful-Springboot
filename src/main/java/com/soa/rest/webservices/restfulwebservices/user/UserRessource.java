package com.soa.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRessource {
	@Autowired
	private UserDaoService service;
	
	@GetMapping ("/users")
	public List<User> retrieveAllUsers()
	{
		return service.findAll();
	}
	
	@GetMapping ("/users/{id}")
	public User retrieveUser(@PathVariable int id)
	{
		return service.findOne(id);
	}
	
	@PostMapping("/users")
	public void createdUser(@RequestBody User user)
	{
		User savedUser = service.save(user);
	}

}

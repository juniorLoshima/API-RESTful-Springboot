package com.soa.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList <>();
	private static int usersCount = 5;
	static {
		
		users.add(new User(1, "Junior", new Date()));
		users.add(new User(2, "Diop", new Date()));
		users.add(new User(3, "Diallo", new Date()));
		users.add(new User(4, "Diouf", new Date()));
		users.add(new User(5, "Felix", new Date()));
	}

	public List<User> findAll(){

		return users;

	}
	
	public User save(User user)
	{
		if(user.getId()==null)
		{
		user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id)
	{
		for(User user:users)
		{
			if(user.getId()==id)
				{ 
				return user;
				}
		}
				return null;
	}
}

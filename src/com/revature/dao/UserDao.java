package com.revature.dao;

import java.util.List;

import com.revature.dto.User;

public interface UserDao {
	
	// Retrieve all Users from customer table 
	public List<User> getUsers();
	
	// Retrieve a Users by id from Users table
	public User getUser(int id);
	
	
	// retrieve a Users by name from Users table
	public User getUser(String name);
	
	// retrieve a Users by name from Users table
	public User getUserByUserName(String username);
	
	
	// insert a Users into Users table
	public void insertUser(User user);
	
	
	// update Users info
	public void update(User user);
	
	
	// delete Users using a Users id
	public void delete(int id);

}

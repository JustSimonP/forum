package com.Alpaca.forum.dao;

import java.util.List;

import com.Alpaca.forum.entities.User;

public interface UserDAO {
	
	
	public  List<User>findAll();
	
	public User findById(int theID);

	public void updateUser(User theUser);
	public void addUser(User theUser);
	public void deleteByID(int theID);
	public User findByUsername(String username);
	public User findByEmail(String email);

}
package com.revature.ers.dao;

import java.util.ArrayList;

import com.revature.ers.pojo.Reimbursement;
import com.revature.ers.pojo.User;

public interface UsersDao {
	
		
    public User addUser(User usr); // good
	
	public User getUserById(int id); // good
	
	public User getUserByUsername(String user); // good
	
	// add getUserByEmail()
	public User getUserByEmail(String email);
	
	public User updateUser(User user); // good
	
	// add getAllUsers()
	public ArrayList<User> getAllUsers();
}

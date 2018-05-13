package com.revature.ers.services;

import com.revature.ers.dao.UsersDao;
import com.revature.ers.dao.UsersDaoImp;
import com.revature.ers.pojo.User;

public class LoginService {
	
	public static  UsersDao userDao = new UsersDaoImp();
	
	// Gets a user and compare if email and username are available
	// if they are available it get sends to the addUser() dao layer.
	public User createNewUser(User user) {
		
		if(emailAvailable(user.getEmail()) && usernameAvailable(user.getUserName())) {
			return userDao.addUser(user);
			
		}
		return null;
	}
	
	public User getUserById(int id) {
		return userDao.getUserById(id);
		
	}
	
	public User getUserByUserName(String user) {
		return userDao.getUserByUsername(user);
	}

	public User getUserByEmail(String email) {
		return userDao.getUserByEmail(email);
	}
	
	public User updateUser(User user) {
		return userDao.updateUser(user);
	}

	private boolean emailAvailable(String email) {
		
		for(User user : userDao.getAllUsers()) {
			if(user.getEmail().equalsIgnoreCase(email)){
				return false;
			}
		}
		
		return true;
	}


	private boolean usernameAvailable(String userName) {
		
		for(User user : userDao.getAllUsers()) {
			if(user.getUserName().equalsIgnoreCase(userName)) {
				return false;
			}
		}
		
		return true;
	}
	
	public User login(User user) {
		User userMatch = userDao.getUserByUsername(user.getUserName());
		
		if(user.getUserName() != null) {
			if(userMatch.getPw().equals(user.getPw())) {
				return userMatch;
			}
		}
		return null;
		
	}	
}

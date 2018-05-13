package com.revature.ers.driver;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.revature.ers.dao.ReimbDao;
import com.revature.ers.dao.ReimbDaoImp;
import com.revature.ers.dao.ReimbStatusDao;
import com.revature.ers.dao.ReimbStatusDaoImp;
import com.revature.ers.dao.UsersDao;
import com.revature.ers.dao.UsersDaoImp;
import com.revature.ers.pojo.Reimb_Status;
import com.revature.ers.pojo.Reimbursement;
import com.revature.ers.pojo.User;
import com.revature.ers.util.ConnectionFactory;

import oracle.sql.TIMESTAMP;

public class ERS_Driver {

	public static void main(String[] args) {
		
		System.out.println("Application is Working!");
		
//		ReimbDao reimbDao = new ReimbDaoImp();
		
		UsersDao userDao = new UsersDaoImp();
		
//		ReimbStatusDao statusDao = new ReimbStatusDaoImp();
//		
//***************** REIMBURSEMENT TESTS ***********************************//
		
//		// Get Status by Id
//		Reimb_Status myStatus = statusDao.getStatusById(2);
//		System.out.println(myStatus);
		
//***************** END OF REIMBURSEMENT TESTS ****************************//
		
//***************** USER TESTS ********************************************//
		
		
//		// Add a new user to the db.
		User usr = new User("test23", "t123", "Carl", "Dummy", "cdummy@yahoo.com", 1);
		
		userDao.addUser(usr);
		
		
//		//Get user by ID
//		User myUser = userDao.getUserById(30);
//		System.out.println(myUser);
		
//		// Get user by username
//		User myUser = userDao.getUserByUsername("rofl");
//		System.out.println(myUser);
		
//		// Get user by email
//		User myUser = userDao.getUserByEmail("rambo@gmail.com");
//		System.out.println(myUser);
		
		
//		//Update a user record
//		User updUser = userDao.getUserById(30);		
//		System.out.println(updUser);	
//		updUser.setPw("coolio123");
//		updUser.setFirstName("Coolio");
//		updUser.setLastName("Rambo");
//		updUser.setEmail("rambo@gmail.com");
//		boolean wasAdded = userDao.updateUser(updUser);
//		System.out.println(wasAdded);
//		

//		// Get all users
//		ArrayList<User> users = userDao.getAllUsers();
//		for(User users1 : users) {
//			System.out.println(users1);
//			System.out.println("+------------------------------+");
//		}

		
//***************** END OF USER TESTS *************************************//
		
//***************** REIMBURSEMENT TESTS ***********************************//
		
//		// Update reimbursement
//		Reimbursement reimb = reimbDao.getReimbById(21);
//		reimb.setReimbAmount(100.50);
//		reimb.setDesc("updated yesterday");
//		reimb.setStatusId(3);
//		reimb.setType(1);
//		boolean wasUpdated = reimbDao.updateReimbursement(reimb);
//		System.out.println(wasUpdated);
//	
		
		
//		// Get all Reimbursements
//		ArrayList<Reimbursement> reimb = reimbDao.getAllReimbursement();
//		
//		for(Reimbursement reimb1 : reimb) {
//			System.out.println(reimb1);
//			System.out.println("+-------------------------+");
//		}
//		
//		System.out.println("This is all the reimbursements");
		
//		//Get Reimbursements by ID
//		Reimbursement myReimb = reimbDao.getReimbById(1);
//		System.out.println(myReimb);
		
//		//Get Reimbursements by status ID
//		ArrayList<Reimbursement> reimb = reimbDao.getReimbByStatusId(2);
//		
//		for(Reimbursement reimb1 : reimb) {
//			System.out.println(reimb1);
//			System.out.println("+-------------------------+");
//		}
		
//		//Get Reimbursements by type ID
//		ArrayList<Reimbursement> reimb = reimbDao.getReimbByType(3);
//		
//		for(Reimbursement reimb1 : reimb) {
//			System.out.println(reimb1);
//			System.out.println("+-------------------------+");
//		}
		
//		// Add a new Reimbursement
//		String[] newReimbursement = new String[7];
//		
//		newReimbursement[0] = "20.00";	
//		newReimbursement[1] = "Test";
//		newReimbursement[2] = "1";
//		newReimbursement[3] = "2";
//		newReimbursement[4] = "1";
//		newReimbursement[5] = "1";		
//		reimbDao.addReimbursement(newReimbursement);	
		
//*********** END OF REIMBURSEMENT TESTS *********************************//
		
		System.out.println("Program Ending..........");
		
	}

}

package com.revature.ers.dao;

import java.util.ArrayList;

import com.revature.ers.pojo.Reimbursement;

public interface ReimbDao {
	
	// Implemented: Get all reimbursements in an array list format
	public ArrayList<Reimbursement> getAllReimbursement();

	public Reimbursement getReimbById(int id);
	
	public ArrayList<Reimbursement> getReimbByStatusId(int id);
	
	public ArrayList<Reimbursement> getReimbByType(int id);
	
	public Reimbursement addReimbursement(Reimbursement rmb);
	
	public Reimbursement updateReimbursement(Reimbursement reimb);
	
	public ArrayList<Reimbursement> getReimbByAuthor(int id);
	
}

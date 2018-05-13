package com.revature.ers.services;

import java.util.ArrayList;

import com.revature.ers.dao.ReimbDao;
import com.revature.ers.dao.ReimbDaoImp;
import com.revature.ers.pojo.Reimbursement;

public class ReimbursementService {
	
	public static ReimbDao reimbDao = new ReimbDaoImp();
	
	public Reimbursement addReimbursement(Reimbursement rmb) {
		return reimbDao.addReimbursement(rmb);
	}
	
	public Reimbursement updateReimbursement(Reimbursement reimb) {
		return reimbDao.updateReimbursement(reimb);
	}
	
	public ArrayList<Reimbursement> getReimbByAuthor(int id) {
		return reimbDao.getReimbByAuthor(id);
	}
	
	public Reimbursement getReimbById(int id) {
		return reimbDao.getReimbById(id);
	}
	
	public ArrayList<Reimbursement> getReimbByStatusId(int id) {
		return reimbDao.getReimbByStatusId(id);
	}
	
	public ArrayList<Reimbursement> getReimbByType(int id) {
		return reimbDao.getReimbByType(id);
	}
	
	public ArrayList<Reimbursement> getAllReimbursements() {
		return reimbDao.getAllReimbursement();
	}

}

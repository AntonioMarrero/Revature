package com.revature.ers.dao;

import com.revature.ers.pojo.Reimb_Status;

public interface ReimbStatusDao {
	
	public Reimb_Status  getStatusById(int id);
	
	public Reimb_Status getStatusByStatusType(String status);

}

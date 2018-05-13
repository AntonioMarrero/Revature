package com.revature.dao;

import java.util.List;

import com.revature.beans.Bear;
import com.revature.beans.BearType;
import com.revature.beans.Beehive;

public interface BearTypeDao {
	
	public BearType getBearTypeById(int id);
	
	public int addBearType(BearType bt);
	
	public List<BearType> getBearType();
	
	public void updateBearType(BearType bt);
	
	public void deleteBearType(BearType bt);
	
	

}

package com.revature.dao;

import java.util.List;

import com.revature.beans.Cave;

public interface CaveDao {
	
	public List<Cave> getCave();
	
	public Cave getCaveById(int id);
	
	public int addCave(Cave c);
	
	public void updateCave(Cave c);
	
	public void deleteCave(Cave c);

}

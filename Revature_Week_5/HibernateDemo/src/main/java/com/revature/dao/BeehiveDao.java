package com.revature.dao;

import java.util.List;

import com.revature.beans.Beehive;

public interface BeehiveDao {

	public List<Beehive> getBeehive();
	
	public Beehive getBeehiveById(int id);
	
	public int addBeehive(Beehive bh);
	
	public void updateBeehive(Beehive bh);
	
	public void deleteBeehive(Beehive bh);
}

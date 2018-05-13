package com.revature.daos;

import java.util.List;

import com.revature.beans.Bear;

public interface BearDao {
	
	public List<Bear> getBears();
	public Bear getBearById();
	public int addBear(Bear b);
	public void updateBear(Bear b);
	public void deleteBear(Bear b);

}

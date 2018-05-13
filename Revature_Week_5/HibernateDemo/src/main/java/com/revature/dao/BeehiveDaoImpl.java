package com.revature.dao;

import java.util.List;

import org.hibernate.*;


import com.revature.beans.Beehive;
import com.revature.util.HibernateUtil;

public class BeehiveDaoImpl implements BeehiveDao {

	@Override
	public Beehive getBeehiveById(int id) {
		
		Session s = HibernateUtil.getSession();
		Beehive bh = (Beehive) s.get(Beehive.class, id);
		s.close();		
		return bh;
	}

	@Override
	public int addBeehive(Beehive bh) {
		
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int result = (Integer) s.save(bh);
		tx.commit();
		s.close();		
		return result;
	}
	
	@Override
	public List<Beehive> getBeehive() {
		
		Session s = HibernateUtil.getSession();
		Query q = s.createQuery("from Beehive");
		List<Beehive> bhs = q.list();
		s.close();		
		return bhs;
	}

	@Override
	public void updateBeehive(Beehive bh) {
		
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.merge(bh);
		tx.commit();
		s.close();
		
	}

	@Override
	public void deleteBeehive(Beehive bh) {
		
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.delete(bh);
		tx.commit();
		s.close();
		
	}

}

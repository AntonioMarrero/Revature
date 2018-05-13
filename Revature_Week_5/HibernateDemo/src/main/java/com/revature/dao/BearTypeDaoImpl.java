package com.revature.dao;

import java.util.List;

import org.hibernate.*;

import com.revature.beans.BearType;
import com.revature.util.HibernateUtil;

public class BearTypeDaoImpl implements BearTypeDao {

	@Override
	public BearType getBearTypeById(int id) {
		
		Session s = HibernateUtil.getSession();
		BearType bt = (BearType) s.get(BearType.class, id);
		s.close();		
		return bt;
		
	}

	@Override
	public int addBearType(BearType bt) {
		
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int result = (Integer) s.save(bt);
		tx.commit();
		s.close();
		return result;
		
	}

	@Override
	public List<BearType> getBearType() {
		
		Session s = HibernateUtil.getSession();
		Query q = s.createQuery("from BearType");
		List<BearType> bts = q.list();
		s.close();		
		return bts;
	}

	@Override
	public void updateBearType(BearType bt) {
		
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.merge(bt);
		tx.commit();
		s.close();
		
	}

	@Override
	public void deleteBearType(BearType bt) {
		
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.delete(bt);
		tx.commit();
		s.close();
		
	}

}

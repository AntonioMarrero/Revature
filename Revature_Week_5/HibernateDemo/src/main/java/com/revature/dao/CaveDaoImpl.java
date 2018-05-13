package com.revature.dao;

import java.util.List;

import org.hibernate.*;
import org.hibernate.Session;

import com.revature.beans.*;
import com.revature.util.HibernateUtil;

public class CaveDaoImpl implements CaveDao {

	@Override
	public List<Cave> getCave() {
		
		Session s = HibernateUtil.getSession();
		
		Query q = s.createQuery("from Cave");
		
		List<Cave> caves = q.list();
		
		s.close();
		
		return caves;
	}

	@Override
	public Cave getCaveById(int id) {
		
		Session s = HibernateUtil.getSession();
		Cave c = (Cave) s.get(Cave.class, id);
		s.close();
		return c;
		
	}

	@Override
	public int addCave(Cave c) {
		
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int result = (Integer) s.save(c);
		tx.commit();
		s.close();
		return result;
	}

	@Override
	public void updateCave(Cave c) {
		
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.merge(c);
		tx.commit();
		s.close();
		
	}

	@Override
	public void deleteCave(Cave c) {
		
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.delete(c);
		tx.commit();
		s.close();
		
	}
	
	public List<Cave> executeNameQuery(Cave cave){
		Session s = HibernateUtil.getSession();
		Cave c = (Cave) s.get(Cave.class, 1);
		Query q = s.getNamedQuery("findCaveByName");
		q.setString("caveName", c.getName());
		List<Cave> caves = q.list();
		s.close();
		return caves;
		
	}

}

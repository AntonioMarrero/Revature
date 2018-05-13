package com.revature.main;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.beans.*;
import com.revature.dao.*;
import com.revature.util.HibernateUtil;

import oracle.net.aso.s;

public class Driver {

	public static void main(String[] args) {
		
//		CaveDaoImpl cave = new CaveDaoImpl();
//        Cave c = cave.getCaveById(2);
//        
//        BearTypeDaoImpl bt = new BearTypeDaoImpl();
//        BearType b = bt.getBearTypeById(2); 
//        
//        Bear be = new Bear("Pooh",200,b,c);
//        
//        BearDaoImpl bdi = new BearDaoImpl();
//        bdi.addBear(be);
		
//		Session s = HibernateUtil.getSession();
//		Transaction tx = s.beginTransaction();
//		
//		Cave c = (Cave) s.get(Cave.class, 1);
//		BearType bt = (BearType) s.get(BearType.class, 1);
//		
//		tx.commit();
//		s.close();
//		
//		Bear b = new Bear("JSmokey",623,bt, c);
//		//s.save(b);
//		BearDaoImpl bdi = new BearDaoImpl();
//		bdi.addBear(b);
		
//		BearDaoImpl bdi = new BearDaoImpl();
//		System.out.println(bdi.getBearsByCaveId(2));
//		System.out.println(bdi.getBears());
		//System.out.println(bdi.findByTypeCrit("Grizzly"));
		
		//System.out.println(bdi.findBearSizeRange(550, 800));
		//System.out.println(bdi.findBearSizeRange(55, 8000));
		
		//System.out.println(bdi.findByTypeAndCave("Grizzly","Florida"));
		
		//System.out.println(bdi.findJBear());

		//bdi.printNumOfRows();
		
		//getting our cave 
		Session s = HibernateUtil.getSession();
		Cave cave = (Cave) s.get(Cave.class, 1);
		s.close();
//		
//		bdi.executeNamedQuery(cave).forEach(bear -> {
//			System.out.println(((Bear) bear).getCave().getName());
//		});
		
//**************** CAVES ***********************************// 
		
		CaveDaoImpl cdi = new CaveDaoImpl();
		
		cdi.executeNameQuery(cave).forEach(caves -> {
			System.out.println(((Cave) cave).getName());
		});
		
//		// Adds a new Cave to the DB. (C)
//		Cave c = new Cave("Tampa", 15);
//		CaveDaoImpl cdi = new CaveDaoImpl();
//		cdi.addCave(c);
//		System.out.println("Just added cave: " + c);
		
		// Read the Caves (R)
//		System.out.println(cdi.getCave());
		
		// Gets Cave By Id
//		Session s = HibernateUtil.getSession();
//		Transaction tx = s.beginTransaction();
//		int id = 1;	
//		System.out.println(cdi.getCaveById(id));
		
		// update Cave (U)
//		Session s = HibernateUtil.getSession();
//		Transaction tx = s.beginTransaction();
//		Cave c = (Cave) s.get(Cave.class, 1);	
//		c.setName("Orlando");
//		c.setMaxBears(30);
//		cdi.updateCave(c);
//		System.out.println(c);
//		tx.commit();
//		s.close();
		
		// delete Cave (D)
//		Cave c  = new Cave();
//		c.setId(3);
//		cdi.deleteCave(c);
		
// ************************* BEAR TYPES ************************ //

		BearTypeDaoImpl btdi = new BearTypeDaoImpl();
		
		// Adds a new Bear Type to the DB. (C)
//		BearType bt = new BearType("Panda Bear");
//		btdi.addBearType(bt);
//		System.out.println("Just added cave: " + bt);
		
		// Read the Bear Types (R)
//		System.out.println(btdi.getBearType());
		
		// Gets Bear Types By Id
//		Session s = HibernateUtil.getSession();
//		Transaction tx = s.beginTransaction();
//		int id = 3;	
//		System.out.println(btdi.getBearTypeById(id));
		
		// update Bear Type (U)
//		Session s = HibernateUtil.getSession();
//		Transaction tx = s.beginTransaction();
//		BearType bt = (BearType) s.get(BearType.class, 5);	
//		bt.setName("Panda");
//		btdi.updateBearType(bt);
//		System.out.println(bt);
//		tx.commit();
//		s.close();
		
		// delete Bear Type (D)
//		BearType bt  = new BearType();
//		bt.setBearTypeId(6);;
//		btdi.deleteBearType(bt);
	
// ****************** BEEHIVES ****************************//		
	
		BeehiveDaoImpl bhdi = new BeehiveDaoImpl();
		
		// Adds a new Beehive to the DB. (C)
//		Beehive bh = new Beehive(540);
//		bhdi.addBeehive(bh);
//		System.out.println("Just added a beehive: " + bh);
		
		// Read the Beehives (R)
//		System.out.println(bhdi.getBeehive());
		
		// Gets a Beehive By Id
//		Session s = HibernateUtil.getSession();
//		Transaction tx = s.beginTransaction();
//		int id = 3;	
//		System.out.println(bhdi.getBeehiveById(id));
		
		// update a Beehive (U)
//		Session s = HibernateUtil.getSession();
//		Transaction tx = s.beginTransaction();
//		Beehive bh = (Beehive) s.get(Beehive.class, 6);	
//		bh.setWeight(110);
//		bhdi.updateBeehive(bh);
//		System.out.println(bh);
//		tx.commit();
//		s.close();
		
		// delete Beehive (D)
//		Beehive bh  = new Beehive();
//		bh.setId(6);
//		bhdi.deleteBeehive(bh);
	
		
	}

}

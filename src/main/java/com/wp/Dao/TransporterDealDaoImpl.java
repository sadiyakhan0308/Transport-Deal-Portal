package com.wp.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wp.Models.TransporterDeal;



@Repository
public class TransporterDealDaoImpl implements TransporterDealDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void addTransporterDeal(TransporterDeal transporterdeal) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(transporterdeal);
		tr.commit();
		session.close();
	}

	public void removeTransporterDeal(Integer dealid) {
		Session session = sessionFactory.openSession();
		TransporterDeal transporterdeal = session.get(TransporterDeal.class, dealid);
		Transaction tr = session.beginTransaction();
		session.delete(transporterdeal);
		tr.commit();
		session.close();

	}

	public void updateTransporterDeal(TransporterDeal transporterdeal) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.update(transporterdeal);
		tr.commit();
		session.close();
	}

	public TransporterDeal gettransporterByDealid(Integer dealid) {
		Session session = sessionFactory.openSession();
		TransporterDeal transporterdeal = session.get(TransporterDeal.class, dealid);
		session.close();
		return transporterdeal;
	}

	public List<TransporterDeal> getAllTransportersDeal() {
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(TransporterDeal.class);
		List<TransporterDeal> transportersdeal = cr.list();
		session.close();
		return transportersdeal;
	}

}
package com.wp.Dao;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.wp.Models.Transporter;


@Repository
public class TransporterDaoImpl implements TransporterDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void addTransporter(Transporter transporter) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(transporter);
		tr.commit();
		session.close();
	}

	public void removeTransporter(String email) {
		Session session = sessionFactory.openSession();
		Transporter transporter = session.get(Transporter.class, email);
		Transaction tr = session.beginTransaction();
		session.delete(transporter);
		tr.commit();
		session.close();

	}

	public void updateTransporter(Transporter transporter) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.update(transporter);
		tr.commit();
		session.close();
	}

	public Transporter gettransporterByEmailid(String email) {
		Session session = sessionFactory.openSession();
		Transporter transporter = session.get(Transporter.class, email);
		session.close();
		return transporter;
	}

	public List<Transporter> getAllTransporters() {
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Transporter.class);
		List<Transporter> transporters = cr.list();
		session.close();
		return transporters;
	}

	

}
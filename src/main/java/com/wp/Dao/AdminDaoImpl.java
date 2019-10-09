


package com.wp.Dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wp.Models.Admin;



@Repository
public class AdminDaoImpl implements AdminDao {

	@Autowired
	private SessionFactory sessionFactory;

	
	
	public Admin getadminByEmailid(String email) {
		Session session = sessionFactory.openSession();
		Admin admin = session.get(Admin.class, email);
		session.close();
		return admin;
	}

	

}
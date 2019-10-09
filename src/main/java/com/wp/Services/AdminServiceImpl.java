package com.wp.Services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wp.Dao.AdminDao;
import com.wp.Models.Admin;
import com.wp.Models.Login;

@Service
public class AdminServiceImpl implements AdminService{

	
	@Autowired
	 private AdminDao  daoInterface;
	@Autowired
	private SessionFactory sessionfactory;
	
	
	public Admin searchAdmin(String email) {
		
		return daoInterface.getadminByEmailid(email);
	}

	
	public boolean loginadmin(Login login){
		boolean exists;
		String email=login.getEmail();
		String password=login.getPassword();
		login.setRole("Admin");
		 String Role=  login.getRole();
		Session session=sessionfactory.openSession();
		Transaction tr=session.beginTransaction();
		exists=(Long) session.createQuery("select count(*) from Admin where adminEmail='"+email+"' and password='"+password+"'").uniqueResult()>0;
		return exists;	
		
	}
	

}
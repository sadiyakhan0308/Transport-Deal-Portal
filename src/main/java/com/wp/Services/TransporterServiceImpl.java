package com.wp.Services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.hibernate.SessionFactory;

import com.wp.Dao.TransporterDao;
import com.wp.Models.Login;
import com.wp.Models.Transporter;

@Service
public class TransporterServiceImpl implements TransporterService {

	@Autowired
	private TransporterDao daoInterface;
	@Autowired
	private SessionFactory sessionfactory;

	public void transporterEntry(Transporter transporter) {
		daoInterface.addTransporter(transporter);

	}

	public void deletetransporter(String email) {
		daoInterface.removeTransporter(email);

	}

	public void changeTransporterDetails(Transporter transporter) {
		daoInterface.updateTransporter(transporter);

	}

	public Transporter searchTransporter(String email) {

		return daoInterface.gettransporterByEmailid(email);
	}

	public List<Transporter> viewAllTransporters() {

		return daoInterface.getAllTransporters();
	}

	public void updateTransporter(Transporter transporter) {
		daoInterface.updateTransporter(transporter);

	}
	public boolean logintransporter(Login login){
		boolean exists;
		String transporterEmail=login.getEmail();
		String transporterPassword=login.getPassword();
		Session session=sessionfactory.openSession();
		Transaction tr=session.beginTransaction();
		exists=(Long) session.createQuery("select count(*) from Transporter where email='"+transporterEmail+"' and password='"+transporterPassword+"'").uniqueResult()>0;
		return exists;	
		
	}
}

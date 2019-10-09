package com.wp.Services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.hibernate.SessionFactory;

import com.wp.Dao.TransporterDao;
import com.wp.Dao.TransporterDealDao;
import com.wp.Models.Login;
import com.wp.Models.Transporter;
import com.wp.Models.TransporterDeal;

@Service
public class TransporterDealServiceImpl implements TransporterDealService {

	@Autowired
	private TransporterDealDao daoInterface;
	@Autowired
	private SessionFactory sessionfactory;

	public void transporterdealEntry(TransporterDeal transporterdeal) {
		daoInterface.addTransporterDeal(transporterdeal);

	}
	public void deletetransporterdeal(Integer dealid) {
		daoInterface.removeTransporterDeal(dealid);

	}

	

	
	public List<TransporterDeal> viewAllTransportersDeals() {

		return daoInterface.getAllTransportersDeal();
	}

	public void updateTransporterDeal(TransporterDeal transporterdeal) {
		daoInterface.updateTransporterDeal(transporterdeal);

	}
	
	
}

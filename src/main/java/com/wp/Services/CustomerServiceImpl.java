package com.wp.Services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wp.Dao.CustomerDao;
import com.wp.Models.Customer;
import com.wp.Models.Login;

@Service
public class CustomerServiceImpl implements CustomerService{

	
	@Autowired
	 private CustomerDao  daoInterface;
	@Autowired
	private SessionFactory sessionfactory;
	public void customerEntry(Customer customer) {
		daoInterface.addCustomer(customer);
		
	}

	public void deleteCustomer(String email) {
		daoInterface.removeCustomer(email);
		
	}

	public void changeCustomerDetails(Customer customer) {
		daoInterface.updateCustomer(customer);
		
	}

	
	public Customer searchCustomer(String email) {
		
		return daoInterface.getcustomerByEmailid(email);
	}

	public List<Customer> viewAllCustomers() {
		
		return daoInterface.getAllCustomers();
	}

	public void updateCustomer(Customer customer) {
		daoInterface.updateCustomer(customer);
		
	}

	public boolean logincustomer(Login login){
		boolean exists;
		String customerEmail=login.getEmail();
		String customerPassword=login.getPassword();
		Session session=sessionfactory.openSession();
		Transaction tr=session.beginTransaction();
		exists=(Long) session.createQuery("select count(*) from Customer where email='"+customerEmail+"' and password='"+customerPassword+"'").uniqueResult()>0;
		return exists;	
		
	}
	

}
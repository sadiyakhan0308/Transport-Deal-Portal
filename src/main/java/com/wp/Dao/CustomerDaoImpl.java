
package com.wp.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wp.Models.Customer;


@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void addCustomer(Customer customer) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(customer);
		tr.commit();
		session.close();
	}

	public void removeCustomer(String email) {
		Session session = sessionFactory.openSession();
		Customer customer = session.get(Customer.class, email);
		Transaction tr = session.beginTransaction();
		session.delete(customer);
		tr.commit();
		session.close();

	}

	public void updateCustomer(Customer customer) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.update(customer);
		tr.commit();
		session.close();
	}

	public Customer getcustomerByEmailid(String email) {
		Session session = sessionFactory.openSession();
		Customer customer = session.get(Customer.class, email);
		session.close();
		return customer;
	}

	public List<Customer> getAllCustomers() {
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Customer.class);
		List<Customer> customers = cr.list();
		session.close();
		return customers;
	}

}
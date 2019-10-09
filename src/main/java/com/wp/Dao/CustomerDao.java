package com.wp.Dao;

import java.util.List;

import com.wp.Models.Customer;

public interface CustomerDao {

	public void addCustomer(Customer customer);

	public void removeCustomer(String email);

	public void updateCustomer(Customer Customer);

	public Customer getcustomerByEmailid(String email);

	public List<Customer> getAllCustomers();
}
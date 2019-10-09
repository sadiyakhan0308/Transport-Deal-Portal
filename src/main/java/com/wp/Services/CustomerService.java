package com.wp.Services;

import java.util.List;

import com.wp.Models.Customer;

public interface CustomerService {
	public void customerEntry(Customer customer);

	public void deleteCustomer(String email);

	public Customer searchCustomer(String email);

	public void updateCustomer(Customer customer);

	public void changeCustomerDetails(Customer customer);

	public List<Customer> viewAllCustomers();

}
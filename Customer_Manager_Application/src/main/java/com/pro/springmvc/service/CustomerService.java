package com.pro.springmvc.service;

import java.util.List;

import com.pro.springmvc.model.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer cust);
	
	public Customer getCustomer(int id);
	
	public void deleteCustomer(int id);
}

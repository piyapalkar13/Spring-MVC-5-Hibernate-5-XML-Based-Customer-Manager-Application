package com.pro.springmvc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pro.springmvc.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveCustomer(Customer cust) {
		// TODO Auto-generated method stub

	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub

	}

}

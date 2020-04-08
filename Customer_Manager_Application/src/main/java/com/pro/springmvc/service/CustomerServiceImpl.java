package com.pro.springmvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.pro.springmvc.model.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

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

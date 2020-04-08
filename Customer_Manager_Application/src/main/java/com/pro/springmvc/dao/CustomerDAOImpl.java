package com.pro.springmvc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pro.springmvc.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	private static final Logger logger = LoggerFactory.getLogger(CustomerDAOImpl.class);

	private SessionFactory sf;

	public CustomerDAOImpl(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public List<Customer> getCustomers() {

		Session session = sf.getCurrentSession();
		String hql = "from Customer";
		Query q = session.createQuery(hql);
		List<Customer> clist = q.list();

		for (Customer c : clist) {
			logger.info("Customer List :" + c);
		}

		return clist;
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

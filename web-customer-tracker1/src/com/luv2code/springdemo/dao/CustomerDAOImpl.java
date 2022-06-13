package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<Customer> getCustomers() {
		Session cs = sessionFactory.getCurrentSession();
				
		Query<Customer> theQuery = 
				cs.createQuery("from Customer order by lastName",
											Customer.class);
		List<Customer> c = theQuery.getResultList();
				
		return c;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {

		Session cs = sessionFactory.getCurrentSession();
		cs.saveOrUpdate(theCustomer);
		
	}

	@Override
	public Customer getCustomer(int theId) {

		Session cs = sessionFactory.getCurrentSession();
		
		Customer theCustomer = cs.get(Customer.class, theId);
		
		return theCustomer;
	}

	@Override
	public void deleteCustomer(int theId) {

		Session cs = sessionFactory.getCurrentSession();
		
		Query theQuery = 
				cs.createQuery("delete from Customer where id=:customerId");
		theQuery.setParameter("customerId", theId);
		
		theQuery.executeUpdate();		
	}

}












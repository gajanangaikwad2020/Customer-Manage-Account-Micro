package com.customer.daoIMPL;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.dao.CustomerDao;
import com.customer.entity.Customer;

@Repository
public class CustomerDaoIMPL implements CustomerDao {

	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public boolean saveCustomer(Customer customer) {
		boolean saved = false;
		Session session = sessionFactory.openSession();
		Customer customer2 = session.get(Customer.class,customer.getCustomerId());
		if(customer2 == null) {
			Transaction transaction = session.beginTransaction();
			session.save(customer);
			transaction.commit();
			saved = true;
		}
		return saved;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		boolean updated = false;
		Session session = sessionFactory.openSession();
		Customer customer2 = session.get(Customer.class,customer.getCustomerId());
		if(customer2 != null) {
			Transaction transaction = session.beginTransaction();
			session.update(customer);
			transaction.commit();
			updated = true;
		}
		return updated;
		}
	@Override
	public List<Customer> getAllCustomers() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		return criteria.list();
	}

	@Override
	public Customer getCustomer(int customerId) {
		Session session = sessionFactory.openSession();
		return session.get(Customer.class, customerId);
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		boolean deleted = false;
		Session session = sessionFactory.openSession();
		Customer customer = session.get(Customer.class,customerId);
		if(customer != null) {
			Transaction transaction = session.beginTransaction();
			session.delete(customer);
			transaction.commit();
			deleted = true;
		}
		return deleted;
	}

}

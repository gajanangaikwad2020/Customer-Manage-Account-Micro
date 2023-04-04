package com.customer.dao;

import java.util.List;

import com.customer.entity.Customer;

public interface CustomerDao {

	boolean saveCustomer(Customer customer);

	boolean updateCustomer(Customer customer);

	List<Customer> getAllCustomers();

	Customer getCustomer(int customerId);

	boolean deleteCustomer(int customerId);

}

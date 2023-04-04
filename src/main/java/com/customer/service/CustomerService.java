package com.customer.service;

import java.util.List;

import com.customer.entity.Customer;
import com.customer.model.CustomerAccount;

public interface CustomerService {

	boolean saveCustomer(Customer customer);

	boolean updateCustomer(Customer customer);

	List<CustomerAccount> getAllCustomers();

	CustomerAccount getCustomer(int customerId);

	boolean deleteCustomer(int customerId);

}

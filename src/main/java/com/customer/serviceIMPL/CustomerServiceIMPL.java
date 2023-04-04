package com.customer.serviceIMPL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.customer.dao.CustomerDao;
import com.customer.entity.Customer;
import com.customer.model.Account;
import com.customer.model.CustomerAccount;
import com.customer.service.CustomerService;

@Service
public class CustomerServiceIMPL implements CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public boolean saveCustomer(Customer customer) {
		return customerDao.saveCustomer(customer);
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		return customerDao.updateCustomer(customer);
	}

	@Override
	public List<CustomerAccount> getAllCustomers() {
		
		 List<Customer> allCustomers = customerDao.getAllCustomers();
		 List<CustomerAccount> accounts = new ArrayList<>();
		 for (Customer customer : allCustomers) {
			 Account account = restTemplate.getForObject("http://localhost:8082/account/get-account-by-id/"+customer.getaccountId(),Account.class);
				CustomerAccount account2 = new CustomerAccount();
				account2.setCustomerId(customer.getCustomerId());
				account2.setCustomerName(customer.getCustomerName());
				account2.setCustomerPhoneNo(customer.getCustomerPhoneNo());
				account2.setCustomerAddress(customer.getCustomerAddress());
				account2.setAccountId(account.getAccountId());
				account2.setAccountNumber(account.getAccountNumber());
				account2.setAccountBranch(account.getAccountBranch());
				account2.setAccountIFSC(account.getAccountIFSC());
				account2.setAccountBalance(account.getAccountBalance());
				accounts.add(account2);
		}
		 return accounts;
	}

	@Override
	public CustomerAccount getCustomer(int customerId) {
		Customer customer = customerDao.getCustomer(customerId);
		Account account = restTemplate.getForObject("http://localhost:8082/account/get-account-by-id/"+customer.getaccountId(),Account.class);
		CustomerAccount account2 = new CustomerAccount();
		account2.setCustomerId(customer.getCustomerId());
		account2.setCustomerName(customer.getCustomerName());
		account2.setCustomerPhoneNo(customer.getCustomerPhoneNo());
		account2.setCustomerAddress(customer.getCustomerAddress());
		account2.setAccountId(account.getAccountId());
		account2.setAccountNumber(account.getAccountNumber());
		account2.setAccountBranch(account.getAccountBranch());
		account2.setAccountIFSC(account.getAccountIFSC());
		account2.setAccountBalance(account.getAccountBalance());
     	return account2 ;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		return customerDao.deleteCustomer(customerId);
	}

}

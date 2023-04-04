package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.entity.Customer;
import com.customer.exception.ResourceAlreadyExist;
import com.customer.exception.ResourceNotFoundException;
import com.customer.model.CustomerAccount;
import com.customer.service.CustomerService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@PostMapping(value = "/save-customer")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer customer) {
		boolean saved = customerService.saveCustomer(customer);
		if (saved) {
			return new ResponseEntity<String>("Data Saved SuccessFully", HttpStatus.OK);
		} else {
			throw new ResourceAlreadyExist("Resource Already Exists for Id " + customer.getCustomerId());
		}
	}

	@PutMapping(value = "/update-customer")
	public ResponseEntity<String> updateCustomer(@RequestBody Customer customer) {
		boolean updated = customerService.updateCustomer(customer);
		if (updated) {
			return new ResponseEntity<String>("Data Updated SuccessFully for Id "+customer.getCustomerId(), HttpStatus.OK);
		} else {
			throw new ResourceNotFoundException("Resource Not Exists for Id " + customer.getCustomerId());
		}
	}
	
	@DeleteMapping(value = "/delete-customer/{customerId}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int customerId) {
		boolean deleted = customerService.deleteCustomer(customerId);
		if (deleted) {
			return new ResponseEntity<String>("Data Deleted SuccessFully for Id "+customerId, HttpStatus.OK);
		} else {
			throw new ResourceNotFoundException("Resource Not Exists for Id " + customerId);
		}
	}
	
	@GetMapping(value = "/get-customer/{customerId}")
	public ResponseEntity<CustomerAccount> getCustomer(@PathVariable int customerId) {
		CustomerAccount customer = customerService.getCustomer(customerId);
		if (customer != null) {
			return new ResponseEntity<CustomerAccount>(customer, HttpStatus.OK);
		} else {
			throw new ResourceNotFoundException("Resource Not Exists for Id " + customerId);
		}
	}
	
	@GetMapping(value = "/get-all-customers")
	public ResponseEntity<List<CustomerAccount>> getAllCustomers() {
		List<CustomerAccount> list = customerService.getAllCustomers();
		if (!list.isEmpty()) {
			return new ResponseEntity<List<CustomerAccount>>(list, HttpStatus.OK);
		} else {
			throw new ResourceNotFoundException("Resource Not Exists");
		}
	}

	
	
}

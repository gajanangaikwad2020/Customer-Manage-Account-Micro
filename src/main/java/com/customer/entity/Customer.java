package com.customer.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	private int customerId;
	private String customerName;
	private String customerPhoneNo;
	private String customerAddress;
	private int accountId;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String customerName, String customerPhoneNo, String customerAddress, int accountId) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhoneNo = customerPhoneNo;
		this.customerAddress = customerAddress;
		this.accountId = accountId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhoneNo() {
		return customerPhoneNo;
	}

	public void setCustomerPhoneNo(String customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getaccountId() {
		return accountId;
	}

	public void setaccountId(int accountId) {
		this.accountId = accountId;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPhoneNo="
				+ customerPhoneNo + ", customerAddress=" + customerAddress + ", accountId=" + accountId + "]";
	}

}

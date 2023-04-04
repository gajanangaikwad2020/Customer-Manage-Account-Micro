package com.customer.model;

import java.util.Date;

public class CustomerAccount {

	private int customerId;
	private String customerName;
	private String customerPhoneNo;
	private String customerAddress;
	private int accountId;
	private long accountNumber;
	private String accountBranch;
	private String accountIFSC;
	private double accountBalance;
	private Date createdDate;

	public CustomerAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerAccount(int customerId, String customerName, String customerPhoneNo, String customerAddress,
			int accountId, long accountNumber, String accountBranch, String accountIFSC, double accountBalance,
			Date createdDate) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhoneNo = customerPhoneNo;
		this.customerAddress = customerAddress;
		this.accountId = accountId;
		this.accountNumber = accountNumber;
		this.accountBranch = accountBranch;
		this.accountIFSC = accountIFSC;
		this.accountBalance = accountBalance;
		this.createdDate = createdDate;
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

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountBranch() {
		return accountBranch;
	}

	public void setAccountBranch(String accountBranch) {
		this.accountBranch = accountBranch;
	}

	public String getAccountIFSC() {
		return accountIFSC;
	}

	public void setAccountIFSC(String accountIFSC) {
		this.accountIFSC = accountIFSC;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "CustomerAccount [customerId=" + customerId + ", customerName=" + customerName + ", customerPhoneNo="
				+ customerPhoneNo + ", customerAddress=" + customerAddress + ", accountId=" + accountId
				+ ", accountNumber=" + accountNumber + ", accountBranch=" + accountBranch + ", accountIFSC="
				+ accountIFSC + ", accountBalance=" + accountBalance + ", createdDate=" + createdDate + "]";
	}

}

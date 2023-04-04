package com.customer.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Account {
	private int accountId;
    private long accountNumber;
	private String accountBranch;
	private String accountIFSC;
	private double accountBalance;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accountId, long accountNumber, String accountBranch, String accountIFSC, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountNumber = accountNumber;
		this.accountBranch = accountBranch;
		this.accountIFSC = accountIFSC;
		this.accountBalance = accountBalance;
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
	
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountNumber=" + accountNumber + ", accountBranch="
				+ accountBranch + ", accountIFSC=" + accountIFSC + ", accountBalance=" + accountBalance+ "]";
	}

}

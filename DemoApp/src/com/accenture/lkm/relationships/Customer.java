package com.accenture.lkm.relationships;

public class Customer {
	private String custName;
	private Account account;

	public Customer() {
		account = new Account();
		account.setAccNo(101);
		account.setAmount(10000);

	}
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

}

package com.spring.DA;

public class Account implements Comparable<Account>{
	private int id;
	private String balance;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int id, String balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Account)) {
			return false;
		}
		Account other = (Account) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}
	public int compareTo(Account arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}

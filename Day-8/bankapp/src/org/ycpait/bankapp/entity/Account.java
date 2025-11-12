package org.ycpait.bankapp.entity;

public class Account {
	private int balance;
	
	public Account(int balance) {
		this.balance=balance;
	}
	
	public void setBalance(int balance) {
		this.balance=balance;
	}
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int amount) {
		System.out.println(this.balance + " check balance by "+Thread.currentThread().getName());
		this.balance-=amount;
		System.out.println(this.balance + " check balance by "+Thread.currentThread().getName());
	}
	public void deposit(int amount) {
		System.out.println(this.balance + " check balance by "+Thread.currentThread().getName());
		this.balance+=amount;
		System.out.println(this.balance + " check balance by "+Thread.currentThread().getName());
	}
}

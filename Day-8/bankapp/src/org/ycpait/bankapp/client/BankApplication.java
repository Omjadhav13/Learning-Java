package org.ycpait.bankapp.client;

import org.ycpait.bankapp.entity.*;
public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account(5000);
		
		Thread wife=new Thread(()->account.withdraw(1000));
		wife.setName("wife");
		
		Thread husband=new Thread(()->account.deposit(1000));
		husband.setName("husband");
		
		wife.start();
		husband.start();
	}

}

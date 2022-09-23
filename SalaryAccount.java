package com.inheritance.bll;

public class SalaryAccount  implements BankAccount {
	
			private double balance;
			
			public SalaryAccount() {
				
			}
			
			public SalaryAccount(double balance) {
				this.balance = balance;
			}
			
		
			public double getBalance() {
				return balance;
			}
	
			public void deposit(double amount) {
				//balance = balance + amount;
				
				balance += amount;
			}
			
		
			public boolean withdraw(double amount) {
				if(balance >= amount) {
					balance -= amount;
					return true;
				}
				
				return false;
			}

}

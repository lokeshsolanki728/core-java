package com.oops;

public class Account {

	public double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void Deposite(int amt) {

		System.out.println("Total balance" + balance);
		System.out.println("Deposite Amt" + amt);
		balance = balance + amt;
		System.out.println("After Deposite Amt" + balance);
	}

	public void Withdrawal(int amt) {

		if (balance > amt) {
			System.out.println("Total balance" + balance);
			System.out.println("Withdrawl Amt" + amt);
			balance = balance - amt;
			System.out.println("After Withdrawl Amt" + balance);
		} else {

			System.out.println("pese nin h");
		}
	}

	public static void main(String[] args) {
		Account ac = new Account();
		ac.setBalance(2000);
		ac.Deposite(500);
		ac.Withdrawal(10000);
	}

}
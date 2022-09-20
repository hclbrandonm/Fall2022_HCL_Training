package com.brandon.JavaAssignment3;

public class Bank {

	public static double deposit(double amount, double balance) {
		double newBalance = amount + balance;
		System.out.println("Updated Balance: ");
		return newBalance;
	}
	
	public static double withdraw(double amount, double balance) {
		System.out.println("Updated Balance: ");
		double newBalance = 0.0;
		if(balance >= amount) {
		 newBalance = balance - amount;
		}else {
			return 0.0;
			
		}
		return newBalance;
	}
	
	
	public static void main(String[] args) {
		//System.out.println(deposit(5000, 2000));
		//System.out.println(withdraw(3000, 4000));

	}

}

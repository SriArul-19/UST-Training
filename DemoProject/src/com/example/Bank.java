package com.example;

public class Bank
{
	int amount=2000;
	void balance()
	{
		System.out.println("The amount balance is "+amount);
	}
	void withdraw(int amount)
	{
		if(amount<this.amount)
		{
			this.amount-=amount;
			balance();
			System.out.println("Withdraw Successfull");
		}
		else
		{
			System.out.println("The withdraw amount is less than balance");
		}
	}
	void deposit(int amount)
	{
		this.amount+=amount;
		balance();
		System.out.println("Deposit Successfull");
	}
    public static void main(String[] args) 
    {
    	Balance b=new Balance();
    	b.balance();
    	b.
    }
}

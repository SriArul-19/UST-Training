package com.example;

public class InstanceVariable 
{

	int amount=2000; //instance variable
	void display() //instance method
	{
		System.out.println("The available amount is "+amount);
	}

	public static void main(String[] args) 
	{

	InstanceVariable b1=new InstanceVariable();

	InstanceVariable b2=new InstanceVariable();

	b1.amount+=5000;

	System.out.println("First Object "+b1.amount);

	System.out.println("Second Object "+b2.amount);

	}
}

package com.example;

public class StaticVariable
{
	static int amount=2000; // static variable
	static void display() // static method
	{
		System.out.println("The available amount is "+amount);
	}


	public static void main(String[] args)
	{

		StaticVariable b1=new StaticVariable();

		StaticVariable b2=new StaticVariable();

		b1.amount+=5000;

		System.out.println("First Object "+b1.amount);

		System.out.println("Second Object "+b2.amount);

		System.out.println("Class Level access "+StaticVariable.amount);
		StaticVariable.display();

	}
}

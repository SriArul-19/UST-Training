package com.example;

public class Dog {
	static int legs=4;
	static void eat()
	{
		System.out.println("Dog eats bones");
	}
	public static void main(String[] args) {
		Dog d=new Dog();
		System.out.println("It is main method");
		System.out.println("Dog has "+legs+" legs");
		d.eat();
	}

}

package com.oops.multipleinheritanceusinginterface;

import java.util.Scanner;

public class Customer2 extends ICICBank{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount");
		int amount=sc.nextInt();
		System.out.println("enter the years");
		int years=sc.nextInt();
		Customer2 c2=new Customer2();
		c2.interest(amount,years);
}
}
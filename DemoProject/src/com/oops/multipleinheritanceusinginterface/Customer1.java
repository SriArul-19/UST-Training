package com.oops.multipleinheritanceusinginterface;

import java.util.Scanner;

public class Customer1 extends SBIBank {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the amount");
	int amount=sc.nextInt();
	System.out.println("enter the years");
	int years=sc.nextInt();
	Customer1 c1=new Customer1();
	c1.interest(amount,years);
}
}

package com.example;

import java.util.Scanner;

public class InputUsingScan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println("Hai "+name);
		System.out.println("Enter first number:");
		float a=sc.nextFloat();
		System.out.println("Enter second number:");
		float b=sc.nextFloat();
		System.out.println("Addition is "+(a+b));
;	}

}